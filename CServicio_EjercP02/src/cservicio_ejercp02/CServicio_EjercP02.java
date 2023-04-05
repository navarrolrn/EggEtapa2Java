
package cservicio_ejercp02;

import Servicios.CafeteraServicio;
import java.util.Scanner;

public class CServicio_EjercP02 {

    public static void main(String[] args) {
        CafeteraServicio control = new CafeteraServicio();
        Scanner leer=new Scanner(System.in);
        int ctdad;
        boolean salir=false;
        
        while (!salir){
            System.out.println("Cafetera NESPRESSO");
            System.out.println("\nSELECCIONA una opcion(numero): "
            + "\n1.Llenar Cafetera "
            + "\n2.Servir Taza"
            + "\n3.Vaciar Cafetera"
            + "\n4.Agregar Café"
            + "\n5.Ver Cafetera"
            + "\n6.Salir \n");

            int varRespuesta = leer.nextInt();
            switch (varRespuesta) {
                case 1:
                    control.llenarCafetera();
                    break;
                case 2:
                    System.out.print("Indique la cantidad en ml:");
                    ctdad=leer.nextInt();
                    control.servirTaza(ctdad);
                    break;
                case 3:
                    control.vaciarCafetera();
                    break;
                case 4:
                    System.out.print("Indique la cantidad en ml:");
                    ctdad=leer.nextInt();
                    control.agregarCafe(ctdad);
                    break;
                case 5:
                    control.mostrarCtdad();
                    break;
                case 6:
                    salir=true;
                    break;
                default:
                    System.out.println("INGRESO UNA OPCION INCORRECTA");
             }
       }
    }
    
}
