/*
 *Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 *(la comparación deberá detenerse en cuanto se detecte alguna diferencia 
 *entre los elementos).
 */
package Guia5Enc9al11.ArreglosyVect;

import java.util.Scanner;


public class EjercXtra02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = leer.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + " del primer vector: ");
            vector1[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + " del segundo vector: ");
            vector2[i] = leer.nextInt();
        }

        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }

        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
}
