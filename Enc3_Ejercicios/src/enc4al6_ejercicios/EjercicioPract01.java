
package enc4al6_ejercicios;

import java.util.Scanner;


public class EjercicioPract01 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero entero:");
        numero = leer.nextInt();

        
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
