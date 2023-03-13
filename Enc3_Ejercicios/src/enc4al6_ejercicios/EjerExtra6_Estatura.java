/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general.
 */
package Enc4al6_Ejercicios;

import java.util.Scanner;


public class EjerExtra6_Estatura {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        float altura, suma=0, suma1=0;
        int N, cont=0, cont1=0;
        System.out.println("Ingrese un numero de personas");
        N = leer.nextInt();
        for (int i = 0; i < N; i++) {
            altura=(float)(Math.random()*1+1);
            //altura=(float) (Math.round(altura*100)/100d);
            System.out.println(""+altura);
            cont++;
            suma = suma+altura;
            if (altura<1.60) {
                suma1=suma1+altura;
                cont1++;
            }
        }
        float prom1=suma1/cont1;
        prom1=(float)(Math.round(prom1*100)/100d);
        float prom2=suma/cont;
        prom2=(float)(Math.round(prom2*100)/100d);
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 es: " +prom1+ " METROS");
        System.out.println("El promedio de estatura general es: " +prom2+ " METROS");
    }
    
}
