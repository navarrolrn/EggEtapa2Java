
package Guia3Enc4al6;

import java.util.Scanner;

/*Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario y determine si 
ambos o alguno de ellos es mayor a 25.
*/

public class Ejercicio06EC {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numA;
        int numB;
        
        System.out.println("Ingrese un numero entero:");
        numA = leer.nextInt();
        System.out.println("Ingrese otro numero entero:");
        numB = leer.nextInt();
        
        if(numA>25&&numB>25){
            System.out.println("Ambos números son mayor a 25");
        }else if(numA>25){
            System.out.println("Solo el número "+numA+" es mayor a 25");
        }else if(numB>25){
            System.out.println("Solo el número "+numB+" es mayor a 25");
        }else {
            System.out.println("Ninguno de los números son mayor a 25");
        }
    }
    
}
