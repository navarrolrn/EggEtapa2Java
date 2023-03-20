/*
 *Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
 *con los valores ingresados por el usuario.
 */
package Guia5Enc9al11.ArreglosyVect;

import java.util.Scanner;


public class EjercXtra01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();

        int[] vector = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + " del vector: ");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}
