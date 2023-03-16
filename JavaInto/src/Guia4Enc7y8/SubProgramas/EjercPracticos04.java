/*
 * Crea una aplicación que nos pida un número por teclado y con una función 
se lo pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
17 si es primo.

 */
package Guia4Enc7y8.SubProgramas;

import java.util.Scanner;


public class EjercPracticos04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero;
        do{
            System.out.println("===== VERIFICADOR DE NUMEROS PRIMOS (Para salir ingrese 0)");
            System.out.print("Ingrese un número :");
            numero = leer.nextInt();

            System.out.println("El número "+numero+" es PRIMO ? "+verificaSiEsPrimo(numero));
        }while (numero!=0);
    }//Fin main
    
    public static boolean verificaSiEsPrimo(double valor){
        int divisores=0;
        boolean esPrimo=true;
        for(double x=valor;x>0;x--){
            if(valor%x==0){
                divisores++;
            }
        }
        if(divisores>2){
            esPrimo=false;
        }
        return esPrimo;
    }
}//Fin class
