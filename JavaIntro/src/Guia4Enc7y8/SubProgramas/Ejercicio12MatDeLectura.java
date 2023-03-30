/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
sino informe que no lo son.
 */
package Guia4Enc7y8.SubProgramas;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class Ejercicio12MatDeLectura {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numA;
        int numB;
        
        System.out.print("Ingrese un numero entero:");
        numA = leer.nextInt();
        System.out.print("Ingrese otro numero entero:");
        numB = leer.nextInt();

        EsMultiplo(numA,numB);
        
    }//Fin main
    
    public static void EsMultiplo(int num1, int num2){
        if(num1%num2==0)
            System.out.println(num1+" SI es múltiplo de "+num2);
            else System.out.println(num1+" NO es múltiplo de "+num2);
    }
}//Fin class
