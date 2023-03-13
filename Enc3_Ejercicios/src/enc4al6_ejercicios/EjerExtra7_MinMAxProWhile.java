/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”
 */
package Enc4al6_Ejercicios;

import java.util.Scanner;


public class EjerExtra7_MinMAxProWhile {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int N, cont=0, num=0, max=0, min=0, suma=0;
        System.out.println("Ingrese la cantidad de numeros");
        N = leer.nextInt();
        
        while (cont<N){
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (min==0) {
                min=num;
            }
            cont++;
            if (num>max) {
                max=num;                
            }else if (num<min) {
                min=num;
            }
            suma=suma+num;
            
        } 
        System.out.println("El valor maximo es: " +max);
        System.out.println("El valor minimo es: " +min);
        System.out.println("El valor promedio de los " +N+ " numeros ingresados es: " +suma/cont);
        
    }
    
}
