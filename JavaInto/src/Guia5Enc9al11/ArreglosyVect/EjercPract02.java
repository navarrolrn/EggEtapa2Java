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
        int numBuscar, contador;
        
        //Declaro el vector tipo double con el nombre de numAleatorios (o cualquier nombre que les guste)
        double[] numAleatorios;
        
        //Le asigno el tamaño de 15 al vector numEnteros
        numAleatorios=new double[15];
        
        //Las líneas 19 y 22 pueden ser una sola asi: int[] numEnteros=new int[100];
        
        //Uso bucle for para asignar valores al vector numEnteros
        for(int x=0;x<numAleatorios.length;x++){
            numAleatorios[x]=Math.floor(Math.random() * 100);
        }
        
        //Muestro los datos del vector numEnteros
        //Uso bucle for regresivo comenzando en el tamaño del vector - 1 hasta que x sea = 0
        for(int x=1;x<numAleatorios.length;x++){
            //Imprimir en pantalla el valor de la posición x del vector numEnteros
            System.out.print("["+numAleatorios[x]+"] ");
        }
        System.out.println("Ingrese el número a buscar en el vector: ");
        numBuscar=leer.nextInt();
        
        //Hacer la busqueda y contar las veces que aparece el numero...
    
    }//Fin main
}//Fin class
