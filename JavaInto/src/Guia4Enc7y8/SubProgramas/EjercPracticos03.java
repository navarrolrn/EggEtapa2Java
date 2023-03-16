/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros 
 *introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
 *La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
 *este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
 *El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia4Enc7y8.SubProgramas;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author simon
 */
public class EjercPracticos03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        double monto;
        
        System.out.println("Equivalencia de €URO en Libras, Dólares y Yenes");
        System.out.print("Ingrese la cantidad de €UROS :");
        monto = leer.nextDouble();
        
        cambioDmoneda(monto);
        
    }//Fin main
    
    public static void cambioDmoneda(double cantidad){
        DecimalFormat formatea = new DecimalFormat("###,###.00");
        double libra=0.86;
        double dolar=1.28611;
        double yen=129.852;
        double dolares=(cantidad*dolar);
        System.out.println("En Libras son  : "+formatea.format(cantidad*libra));
        System.out.println("En Dólares son : "+formatea.format(dolares));
        System.out.println("En Yenes so  n : "+formatea.format(cantidad*yen));
    }
}//Fin class
