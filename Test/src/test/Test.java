/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author leonn
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese el numero 1:");
        num1 = leer.nextInt();
        System.out.println("Ingrese el numero 2:");
        num2 = leer.nextInt();
        
        System.out.println("La suma de los numeros ingresados es -> " + (num1 + num2));
    }
    
}
