
package Guia3Enc4al6;

import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar
el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
 */
public class EjercicioPract06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numA, numB, varRespuesta;
        String salir;
        boolean fin = true;
        
        System.out.print("Ingrese el primer valor:");
        numA = leer.nextInt();
        System.out.print("Ingrese el segundo valor:");
        numB = leer.nextInt();

        while(fin){
            System.out.println("\nSELECCIONA una opcion(numero) para ver el Ejercicio:"
                    + "\n1.Sumar "
                    + "\n2.Restar"
                    + "\n3.Multiplicar"
                    + "\n4.Dividir"
                    + "\n5.Salir"
                    + "\n Elija una opción: \n");

            varRespuesta = leer.nextInt();
            switch (varRespuesta) {// Para que solo muestre un resultado, segun lo que eligio el usuario. 
                case 1:
                    System.out.println("La Suma de -> " + numA + " + " + numB + " es: " + (numA+numB));
                    break;
                case 2:
                    System.out.println("La Resta de -> " + numA + " - " + numB + " es: " + (numA-numB));
                     break;
                case 3:
                    System.out.println("La Multiplicación de -> " + numA + " * " + numB + " es: " + (numA*numB));
                     break;
                case 4:
                    System.out.println("La División de -> " + numA + " / " + numB + " es: " + (numA/numB));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir=leer.next();
                    if (salir.equals("S")){
                        fin=false;
                    }
                    break;
                default:
                    System.out.println("INGRESO UNA OPCION INCORRECTA");
            }
        }
    }
}
