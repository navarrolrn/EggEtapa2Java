/*
 *Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y 
 *muestre la suma de sus elementos.
 */
package Guia5Enc9al11.ArreglosyVect;

import java.util.Random;

public class EjercXtra05 {
    public static void main(String[] args) {
        int sumElementos=0;
        
        // Declaración e inicialización de la matriz A
        int[][] matriz = new int[4][4];
        
        // llenamos la matriz A con valores aleatorios
        Random rand = new Random();
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
        
        // mostrar la matriz A e ir sumandos sus elementos
        System.out.println("Matriz original:");
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
                sumElementos=sumElementos+matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("La suma de sus elementos es: "+sumElementos);
        
    }
}
