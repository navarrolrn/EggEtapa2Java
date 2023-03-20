/*
 *Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
 *Después haremos otra función o procedimiento que imprima el vector.
 */
package Guia5Enc9al11.ArreglosyVect;

import java.util.Random;


public class EjercXtra03 {
    public static void main(String[] args) {
        int[] vector = new int[10]; // Tamaño del vector

        rellenarVector(vector); // Llamamos a la función para rellenar el vector

        imprimirVector(vector); // Llamamos a la función para imprimir el vector
    }

    // Función para rellenar el vector con números aleatorios
    public static void rellenarVector(int[] vector) {
        Random rand = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100); // Generamos un número aleatorio entre 0 y 99
        }
    }

    // Procedimiento para imprimir el vector
    public static void imprimirVector(int[] vector) {
        System.out.print("[");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);

            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
