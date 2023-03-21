package Guia5Enc9al11;

//Fibonnacci

import java.util.Scanner;

public class EjercXtra07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();

        int[] vector = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            if(i>1){
                vector[i] = vector[i-1]+vector[i-2];
            }else{
                vector[i]=i;
            }
            
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
    }
}
