/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo 
que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener 
un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
package Enc4al6_Ejercicios;

import java.util.Scanner;


public class EjerExtra9DivConRestas {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n1, n2,residuo=0, cont=0;
        System.out.println("Ingrese dos numeros enteros mayores que uno");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        while (n1>n2) {
            residuo=n1-n2;
            n1=residuo;
            cont++;
        }
        System.out.println("El residuo de la dicision es: " +n1);
        System.out.println("El cociente de la dicision es: " +cont);
        
    }
    
}
