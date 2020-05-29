package tipoparcialsuper;

public class classFolleto {
    private double porc; //Porcentaje de descuento.
    private classProducto[] producto;

    public double getPorc() {
        return porc;
    }

    public void setPorc(double porc) {
        this.porc = porc;
    }


    public classFolleto(double porc, int cantProducto) {
        this.porc = porc;
        this.producto = new classProducto[cantProducto];
    }
    
    public void agregarArticulo(classProducto v){
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] == null) {
                producto[i] = v;
                break;
            }
        }
    }
    
    // 1. Cantidad de artículos ofertados por más de 5 días
    
    public void OfertasSegunDias(int dias){
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null && producto[i].getDiasOferta() > dias) {
                System.out.println(producto[i].toString());
            }
        }
    }
    
    // 2. Total de unidades que hay a la venta (sumatoria del stock).
    
    public int sumatoriaStock(){
        int sumatoria = 0;
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null) {
                sumatoria += producto[i].getStock();
            }
        }
        return sumatoria;
    }
    
    
   // 3. Cantidad de artículos ofrecidos con un descuento superior a $20.
    
    
    public void articulosSegunDescuento(double filtroXPrecio){
        int contador = 0;
        double Descuento;
        System.out.println("//////////Listado de Productos con Descuento superior a "+filtroXPrecio+ "//////////");
         for (int i = 0; i < producto.length; i++) {
             if (producto[i] != null) {
                 Descuento = (producto[i].getPrecioRegular() * porc) / 100.0;
                 if (Descuento > filtroXPrecio){
                     System.out.println(producto[i].toString() + ", Precio OFerta: "+(producto[i].getPrecioRegular() - Descuento));
                     contador++;
                 }                     
             }
        }
        System.out.println("Cantidad de productos:"+contador);
    }
    
    // 4. Total a recaudar por un artículo en particular indicado por su código, suponiendo que se vendan todas
    //las unidades disponibles.

    public double totalRecaudacionPorArticulo(int codigo){
        double total = 0;
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null && producto[i].getCodigo() == codigo) {                
                double descuento = (producto[i].getPrecioRegular() * porc) / 100.0;
                double precioOferta = producto[i].getPrecioRegular() - descuento;
                total = (producto[i].getPrecioRegular() - descuento) * producto[i].getStock();
                System.out.println(producto[i].toString() + ", Oferta: "+ precioOferta);
            }
        }
        return total;
    }
    
   
}
