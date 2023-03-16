/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas.
 */
package Guia3Enc4al6;

import java.util.Scanner;


public class EjerExtra1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int tiempo;
        System.out.println("Ingresa el tiempo en minutos");
        tiempo = leer.nextInt();
        double dias=tiempo/1440;
        int resto = tiempo%1440;
        double horas=resto/60;
        System.out.println("Días: " +dias);
        System.out.println("Horas: " +horas);
        
    }
    
}
/*
package extras;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args){
        
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un tiempo en minutos");
       double min = leer.nextInt();
       
       
       
       System.out.println("El tiempo ingresado en horas es: " + (min/60));
        System.out.println(" ");
        System.out.println("El tiempo ingresado en días de: " + (min/1440));
    }
    
}
//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por 
//ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
//equivalente: 1 día, 2 horas.
*/