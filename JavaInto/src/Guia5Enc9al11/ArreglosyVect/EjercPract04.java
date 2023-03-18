/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
 *y muestre la traspuesta de la matriz. 
 *La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando
 *sus filas por columnas (o viceversa).
 */
package Guia5Enc9al11.ArreglosyVect;

import java.util.Random;

public class EjercPract04 {
    public static void main(String[] args) {
        
        // Declaración e inicialización de la matriz A
        int[][] matrizA = new int[4][4];
        
        // llenamos la matriz A con valores aleatorios
        Random rand = new Random();
        for(int i=0; i<matrizA.length; i++) {
            for(int j=0; j<matrizA[0].length; j++) {
                matrizA[i][j] = rand.nextInt(10);
            }
        }
        
        // mostrar la matriz A
        System.out.println("Matriz original:");
        for(int i=0; i<matrizA.length; i++) {
            for(int j=0; j<matrizA[0].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        
        // Declaración e Inicialización de matriz B para trasponer la matriz A
        int[][] matrizB = new int[matrizA[0].length][matrizA.length];

        // Proceso para trasponer valores de la matriz A en la matriz B
        for(int i=0; i<matrizA.length; i++) {
            for(int j=0; j<matrizA[0].length; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        
        // motrar la matriz B con los datos traspuestos de la matriz A
        System.out.println("Matriz traspuesta:");
        for(int i=0; i<matrizB.length; i++) {
            for(int j=0; j<matrizB[0].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
