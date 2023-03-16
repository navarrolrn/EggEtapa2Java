package Guia3Enc4al6;

import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de 
los números introducidos supere el límite inicial.
 */
public class EjercicioPract05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numLimite, numero, sumaNums=0;

        System.out.print("Ingrese un valor límite positivo:");
        numLimite = leer.nextInt();

        do{
            System.out.print("Ingrese un número:");
            numero = leer.nextInt();

            sumaNums=sumaNums+numero;
            System.out.println("Van ->"+sumaNums);
        }while (sumaNums<=numLimite);
        System.out.println("Límite superado!");
    }//Fin main

}//Fin class
