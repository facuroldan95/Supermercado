
package tipoparcialsuper;

import java.util.Scanner;

public class TipoParcialSuper {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido al control de ofertas del super...");
        System.out.println("Ingrese la cantidad de productos que iran al folleto...");
        int cant = lector.nextInt();
        System.out.println("Ingrese el porcentaje de descuento...");
        double porc = lector.nextDouble();
        
        int[] aCod = new int[cant];
        
        classFolleto Folleto = new classFolleto(porc, cant);
        for (int i = 0; i < cant; i++) {

            int codigo = validarCodigo(aCod);
            aCod[i] = codigo;

            
            System.out.print("Ingrese el nombre: ");
            String nombre = lector.nextLine();
            lector.nextLine();
          
            System.out.println("Ingrese el precio regular...");
            double precioReg = lector.nextDouble();
            
            System.out.println("Ingrese el stock...");
            int stock = lector.nextInt();
            
            System.out.println("ingrese los dias de ofertas...");
            int diasOfertas = lector.nextInt();
            
            classProducto p = new classProducto(codigo, nombre, precioReg, stock, diasOfertas);
            Folleto.agregarArticulo(p);
        }
        
        System.out.println("Cantidad de Articulos S/ cantidad de días...");
        Folleto.OfertasSegunDias(cant);
        
        System.out.println("/////////////////////////////////////////");
        System.out.println("Sumatoria total de Stock");
        
        System.out.println(Folleto.sumatoriaStock());
        System.out.println("/////////////////////////////////////////");
        
        System.out.println("Cantidad de articulos con descuentos superior a $20");
        Folleto.articulosSegunDescuento(20);
        
        System.out.println("/////////////////////////////////////////");
        System.out.println("Sumatoria de Stock segun Codigo");
        System.out.println("Ingrese el codigo para calcular las ganancias...");
        int cod = lector.nextInt();
        while(cod != 0){

            System.out.println("Las ganancias segun la cantidad de stock y precio oferta del codigo :"+cod);
            System.out.println(Folleto.totalRecaudacionPorArticulo(cod));
            System.out.println("Ingrese nuevamente otro codigo... Ingrese (0) para terminar...");
            cod = lector.nextInt();
        }
        
        
        
        System.out.println("/////////////////////////////////////////");
    }
    
    
    public static int validarCodigo(int[] codigos){
        Scanner lector = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Ingrese el codigo...");
        int cod = lector.nextInt();
        while(flag){
            for (int i = 0; i < codigos.length; i++) {
                if (cod == codigos[i]) {
                    System.out.println("Error codigo ya existente... Ingrese otro...");
                    cod = lector.nextInt();
                    flag = true;
                    break;
                    
                    
                }
                else{
                    flag = false;
                    break;
                }
            }
        }
        
        return cod;
    }

}