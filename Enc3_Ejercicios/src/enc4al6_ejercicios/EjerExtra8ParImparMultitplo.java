/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar 
la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. Al igual que en el 
ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break
 */
package Enc4al6_Ejercicios;

import java.util.Scanner;

public class EjerExtra8ParImparMultitplo {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int suma = 0, cont1=0, cont2=0;
        int num;
        do {            
            System.out.println("Ingrese numeros");
            num = leer.nextInt();
            
            if (num<0) {
                break;
            }else if (num%2==0) {
                cont1++;
            }else{
                cont2++;
            }
            suma=cont1+cont2;
        } while (!(num%5==0));
        System.out.println("Cantidad de numeros ingresados: " +suma);
        System.out.println("Cantidad de numeros pares: " +cont1);
        System.out.println("Cantidad de numeros impares: " +cont2);      
    }
    
}
