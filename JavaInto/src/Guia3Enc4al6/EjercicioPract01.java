
package Guia3Enc4al6;

import java.util.Scanner;


public class EjercicioPract01 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero entero:");
        numero = leer.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número "+numero+" es PAR");
        } else {
            System.out.println("El número "+numero+" es IMPAR");
        }
        
    }//Fin main
}
