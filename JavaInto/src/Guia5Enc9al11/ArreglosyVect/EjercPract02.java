/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
 *y le pida al usuario un número a buscar en el vector. El programa mostrará 
 *dónde se encuentra el numero y si se encuentra repetido
*/
package Guia5Enc9al11.ArreglosyVect;

import java.util.Scanner;


public class EjercPract02 {
    public static void main(String[] args){
        //Declaro la variable leer tipo Scanner para poder ingresar datos por teclado
        Scanner leer = new Scanner(System.in);
        
        //Declado 2 variable tipo entero con el nombre de numBuscar y contador que ingresará el usuario
        int numBuscar, contador, posicion;
        
        //Declaro el vector tipo double con el nombre de numAleatorios (o cualquier nombre que les guste)
        int[] numAleatorios;
        
        //Le asigno el tamaño de 15 al vector numEnteros
        numAleatorios=new int[8];
        
        //Las líneas 19 y 22 pueden ser una sola asi: int[] numEnteros=new int[100];
        
        //Uso bucle for para asignar valores al vector numEnteros
        for(int x=0;x<numAleatorios.length;x++){
            numAleatorios[x]=(int) (Math.random() * 100);
        }
        
        //Muestro los datos del vector numEnteros usando un buble FOR MEJORADO        
        for(int elementos: numAleatorios){
            //Imprimir en pantalla el valor de la posición x del vector numEnteros
            System.out.print("["+elementos+"] ");
        }
        System.out.println("");
        System.out.print("Ingrese el número a buscar en el vector: ");
        numBuscar=leer.nextInt();
        
        //Hacer la busqueda y contar las veces que aparece el numero...
        contador=0; //Inicializo el contador en 0 para controlar la cantidad de veces que pueda estar el número busado
        for(int x=0;x<numAleatorios.length;x++){
            if(numAleatorios[x]==numBuscar){
                posicion=x;
                contador++;
                System.out.println("El número "+numBuscar+" se encontró en la posición "+posicion);
            }
        }
        switch(contador){
            case 0:
                System.out.println("El número "+numBuscar+" no se encontró en el vector");
                break;
            case 2:
                System.out.println("El número está repetido "+contador+" veces");
                break;
        }       
    
    }//Fin main
}//Fin class
