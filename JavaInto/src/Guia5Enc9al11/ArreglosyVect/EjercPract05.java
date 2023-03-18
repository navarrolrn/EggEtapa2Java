/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica. 
 *Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
 *pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
 *La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
 *sus filas por columnas (o viceversa).
 */
package Guia5Enc9al11.ArreglosyVect;


public class EjercPract05 {
    public static void main(String[] args) {
        
        int[][] matrizA = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        
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
        
        boolean esAntisimetrica = true;
        for(int i=0; i<matrizA.length; i++) {
            for(int j=0; j<matrizA[0].length; j++) {
                if(matrizA[i][j] != matrizB[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if(!esAntisimetrica) {
                break;
            }
        }
        
        if(esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz NO es antisimétrica.");
        }
    }
}
