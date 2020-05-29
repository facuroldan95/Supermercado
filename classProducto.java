
package tipoparcialsuper;


public class classProducto {
    private int codigo;
    private String nombre;
    private double precioRegular;
    private int stock;
    private int diasOferta;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDiasOferta() {
        return diasOferta;
    }

    public void setDiasOferta(int diasOferta) {
        this.diasOferta = diasOferta;
    }
    
    

    public classProducto(int codigo, String nombre, double precioRegular, int stock, int diasOferta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioRegular = precioRegular;
        this.stock = stock;
        this.diasOferta = diasOferta;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Precio Regular: " + precioRegular + ", Stock: " + stock;
    }
    
    
    
    
}
