
package Guia2Enc2y3;

import java.util.Scanner;

public class Enc2_Ejercicios {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        
        while(!salir){
            System.out.println("\nSELECCIONA una opcion(numero) para ver el Ejercicio:"
                    + "\n1.Pide 2 números y calcula la Suma "
                    + "\n2.Pide tú nombre, lo guarda y muestra en pantalla"
                    + "\n3.Pide una frase y la muestra en Mayúsculas y Minúculas"
                    + "\n4.Pide grados centígrados y los convierte a Farenheit"
                    + "\n5.Pide un número y muestra el doble, triple y raiz cuadrada"
                    + "\n6.Salir \n");

            int varRespuesta = leer.nextInt();
            switch (varRespuesta) {// Para que solo muestre un resultado, segun lo que eligio el usuario. 
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                     break;
                case 3:
                    ejercicio3();
                     break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                     break;
                case 6:
                    salir=true;
                    break;
                default:
                    System.out.println("INGRESO UNA OPCION INCORRECTA");
            }
        }
    }
    public static void ejercicio1() {
        Scanner leer = new Scanner(System.in);
        int numA;
        int numB;
        
        System.out.println("Ingrese un numero entero:");
        numA = leer.nextInt();
        System.out.println("Ingrese otro numero entero:");
        numB = leer.nextInt();
        
        System.out.println("La Suma de -> " + numA + " + " + numB + " es: " + (numA+numB));
    }
    public static void ejercicio2() {
        Scanner leer = new Scanner(System.in);
        String nombre;
         
        System.out.println("Ingrese su nombre:");
        nombre = leer.next();
         
        System.out.println("Este es su nombre -> " + nombre);
    }
    public static void ejercicio3() {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una oración:");
        frase = leer.nextLine();
        
        System.out.println("Frase ingresada, en mayusculas:");
        System.out.println(frase.toUpperCase());
        System.out.println("Frase ingresada, en minusculas:");
        System.out.println(frase.toLowerCase());
    }
    public static void ejercicio4() {
        Scanner leer = new Scanner(System.in);
        String gradosCentigrados;
        
        System.out.println("Ingrese valor en grados centigrados:");
        gradosCentigrados = leer.next();
        
        double cambioAnumero = Double.valueOf(gradosCentigrados);
        
        double Fahrenheit = 32 + (9 * cambioAnumero / 5);
        
        System.out.println("Valor en grados Fahrenheit -> " + Fahrenheit);
    }
    public static void ejercicio5() {
        Scanner leer = new Scanner(System.in);
        int entero;
        
        System.out.println("Ingrese un numero entero:");
        entero = leer.nextInt();
        
        System.out.println("El doble -> " + Math.pow(entero, 2));
        System.out.println("El triple -> " + Math.pow(entero, 3));
        System.out.println("Raiz cuadrada de -> " + entero + " es: " + Math.sqrt(entero));
    }
}