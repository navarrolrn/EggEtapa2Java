
package Guia3Enc4al6;

import java.util.Scanner;
/*
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta 
que la nota sea correcta.
*/

public class Ejercicio08EC {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota=0;
        while (nota<=0||nota>=10){
            System.out.println("Ingrese una nota entre 0 y 10 :");
            nota = leer.nextInt();
        }
        System.out.println("La nota es correcta");
    }//Fin main
}//Fin class
