/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5Enc9al11.ArreglosyVect;

import java.util.Scanner;


public class EjercMat_Lect14 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[10];
        for(int x=0;x<10;x++){
            System.out.print((x+1)+"/10 Ingrese nombre de compañero: ");
            Equipo[x]=leer.next();
        }
        System.out.println("Los integrantes del equipo son:");
        for(int x=0;x<10;x++){
            System.out.println("[ "+Equipo[x]+" ]");
        }
    }//Fin main
}//Fin class
