/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y 
deben devolver sus resultados para imprimirlos en el main. 
 */
package Guia4Enc7y8.SubProgramas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author simon
 */
public class EjercPracticos01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        double numA, numB;
        int varRespuesta;
        String salir;
        boolean fin = true;
        
        System.out.print("Ingrese el primer valor:");
        numA = leer.nextDouble();
        System.out.print("Ingrese el segundo valor:");
        numB = leer.nextDouble();

        while(fin){
            System.out.println("\nSELECCIONA una opcion(numero) para ver el Ejercicio:"
                    + "\n1.Sumar "
                    + "\n2.Restar"
                    + "\n3.Multiplicar"
                    + "\n4.Dividir"
                    + "\n5.Salir"
                    + "\n Elija una opción: \n");

            varRespuesta = leer.nextInt();
            switch (varRespuesta) {// Para que solo muestre un resultado, segun lo que eligio el usuario. 
                case 1:
                    System.out.println("La Suma de -> " + numA + " + " + numB + " es: " + sumar(numA,numB));
                    break;
                case 2:
                    System.out.println("La Resta de -> " + numA + " - " + numB + " es: " + restar(numA,numB));
                     break;
                case 3:
                    System.out.println("La Multiplicación de -> " + numA + " * " + numB + " es: " + multiplicar(numA,numB));
                     break;
                case 4:
                    System.out.println("La División de -> " + numA + " / " + numB + " es: " + dividir(numA,numB));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir=leer.next();
                    if (salir.toUpperCase().equals("S")){
                        fin=false;
                    }
                    break;
                default:
                    System.out.println("INGRESO UNA OPCION INCORRECTA");
            }
        }
    }//Fin main
    
    public static double sumar(double num1, double num2){
        return num1+num2;
    }
    
    public static double restar(double num1, double num2){
        return num1-num2;
    }
    
    public static double multiplicar(double num1, double num2){
        return num1*num2;
    }
    
    public static double dividir(double num1, double num2){
        return num1/num2;
    }
    
}//Fin class
