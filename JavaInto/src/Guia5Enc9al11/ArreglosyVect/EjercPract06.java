/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
 *donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
 *Crear un programa que permita introducir un cuadrado por teclado y determine
 *si este cuadrado es mágico o no. El programa deberá comprobar que los números 
 *introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package Guia5Enc9al11.ArreglosyVect;

import java.util.Scanner;


public class EjercPract06 {
    public static void main(String[] args) {
        
        int[][] cuadrado = new int[3][3];
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que introduzca los números del cuadrado
        System.out.println("Introduce los números del cuadrado separados por espacios:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                int num = sc.nextInt();
                if(num < 1 || num > 9) {
                    System.out.println("Número inválido. Introduce un número entre 1 y 9.");
                    j--;
                    continue;
                }
                cuadrado[i][j] = num;
            }
        }
        
        // Calcular la suma de las filas, columnas y diagonales
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        boolean esCuadradoMagico = true;
        
        for(int i=0; i<3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for(int j=0; j<3; j++) {
                sumaFila += cuadrado[i][j];
                sumaColumna += cuadrado[j][i];
            }
            if(sumaFila != sumaColumna || sumaFila != sumaDiagonal1 || sumaFila != sumaDiagonal2) {
                esCuadradoMagico = false;
                break;
            }
        }
        
        // Imprimir el resultado
        if(esCuadradoMagico) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado NO es mágico.");
        }
    }
}
