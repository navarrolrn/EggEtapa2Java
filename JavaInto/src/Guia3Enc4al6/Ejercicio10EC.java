
package Guia3Enc4al6;

import java.util.Scanner;

/*Utiliza bucles Do While y For para validar ingreso de numeros entre 1 y 20
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/

public class Ejercicio10EC {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, ctdad=1;
        
        do {
           System.out.print(ctdad+"/4 Ingrese un número entre 1 y 20 -> ");
           numero=leer.nextInt();

           if (numero>0&&numero<=20){
                System.out.print(numero);
                for (int y=0; y<numero; y++){
                    System.out.print("*");               
                }
                System.out.println("");
                ctdad++;
           }else {
               System.out.println("Número inválido, debe ser entre 1 y 20");
           }
        } while(ctdad<5);
        
    }//Fin main
}
