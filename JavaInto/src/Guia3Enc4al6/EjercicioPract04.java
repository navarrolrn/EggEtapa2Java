
package Guia3Enc4al6;

import java.util.Scanner;

/*
Escriba un programa que pida una frase o palabra y valide si la primera letra
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
 */
public class EjercicioPract04 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;

        for (int x=0; x<4; x++){
            System.out.print("Ingrese una frase:");
            frase = leer.nextLine();

            if (frase.substring(0, 1).equals("A") ) {
                System.out.println("   Correcto!!!");
            } else {
                System.out.println(" *** Incorrecto ***");
            }
        }
    }//Fin main
    
}
