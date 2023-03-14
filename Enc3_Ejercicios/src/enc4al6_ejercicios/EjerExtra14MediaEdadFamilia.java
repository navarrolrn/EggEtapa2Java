/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
para averiguar la media de edad de los hijos de todas las familias
 */
package Extras;

import java.util.Scanner;


public class EjerExtra14MediaEdadFamilia {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int N, cont=0, M, media=0,suma=0;
        System.out.println("Ingrese la cantidad de familias");//Cantidad de familias
        N = leer.nextInt();
        
        for (int i = 1; i < N+1; i++) {
            System.out.println("Ingres la cantidad de hijos de la familia "+i);
            M = leer.nextInt();
            for (int j = 0; j < M; j++) {
                System.out.println("Edad "+(j+1) );
                int edad = leer.nextInt();
                suma=suma+edad;
                cont++;
            }
            
            //suma=0;
            //cont=0;
        }
        System.out.println("Edad media de familia "  +suma/cont);
    }
    
}
