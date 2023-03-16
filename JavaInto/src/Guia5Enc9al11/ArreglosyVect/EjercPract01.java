/*Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 *y los muestre por pantalla en orden descendente.
*/
package Guia5Enc9al11.ArreglosyVect;


public class EjercPract01 {
    public static void main(String[] args){
        //Declaro el vector tipo entero con el nombre de numEnteros (o cualquier nombre que les guste)
        int[] numEnteros;

        //Declado una variable tipo entero con el nombre de contador para que el resultado se vea mejor
        int contador=0;
        
        //Le asigno el tamaño de 100 al vector numEnteros
        numEnteros=new int[100];
        
        //Las líneas 10 y 16 pueden ser una sola asi: int[] numEnteros=new int[100];
        
        //Uso bucle for para asignar valores al vector numEnteros
        for(int x=0;x<numEnteros.length;x++){
            numEnteros[x]=x+1;
        }
        
        //Muestro los datos del vector numEnteros
        //Uso bucle for regresivo comenzando en el tamaño del vector - 1 hasta que x sea = 0
        for(int x=numEnteros.length-1;x>=0;x--){
            //Imprimir en pantalla el valor de la posición x del vector numEnteros
            System.out.print(numEnteros[x]+" ");
            contador++;
            if(contador==10){ System.out.println(""); contador=0;}
        }
    
    }//Fin main
}// Fin class
