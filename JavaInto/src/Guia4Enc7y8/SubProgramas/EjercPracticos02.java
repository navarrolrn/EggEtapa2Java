/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, 
el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar 
cuando el usuario ingrese la palabra “No”.
 */
package Guia4Enc7y8.SubProgramas;

import java.util.Scanner;


public class EjercPracticos02 {
    public static void main(String[] args) {
        mayorOmenor();
        
    }//Fin main
    
    public static void mayorOmenor(){
        Scanner leer = new Scanner(System.in);
        String nombre, opc;
        int edad;
        
        do {
            System.out.println("Ingrese el nombre de una persona: ");
            nombre = leer.next();
            System.out.println("Ingrese la edad de esta persona: ");
            edad = leer.nextInt();


            if (edad>=18) {
                System.out.println("Es Mayor de edad");
            } else {
                System.out.println("Es Menor de edad");
            }
            
            System.out.print("Desea ingresar otra persona Si o No? ");
            opc = leer.next().toUpperCase();
            System.out.println("");
        } while (!opc.equals("NO") );
                
    }
}//Fin class
