/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 *cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia5Enc9al11.ArreglosyVect;

public class EjercPract03 {
    public static void main(String[] args) {
        int[] vector = {12, 34, 567, 89, 1, 1234, 56, 7890, 12345, 6789};
        int[] contadores = new int[5];

        for (int i = 0; i < vector.length; i++) {
            int numero = vector[i];
            int digitos = 0;

            while (numero != 0) {
                numero /= 10;
                digitos++;
            }

            if (digitos >= 1 && digitos <= 5) {
                contadores[digitos - 1]++;
            }
        }

        for (int i = 0; i < contadores.length; i++) {
            System.out.println("Cantidad de números con " + (i + 1) + " dígitos: " + contadores[i]);
        }
    }
}
