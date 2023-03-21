/*
 *Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
 *a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
 *de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
 *en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
 *rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
 *Finalmente imprima por pantalla la sopa de letras creada.
 *Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
 *de Java substring(), Length() y Math.random().
 */
package Guia5Enc9al11.ArreglosyVect;

import java.util.Scanner;

public class EjercXtra06 {
    public static void main(String[] args) {
        // Declaración e inicialización de la sopaDletras
        Scanner leer = new Scanner(System.in);
        String palabra;
        int fila,numAleatorio;
        int ctdad=1;
        int xFil=20;
        int xCol=20;
        String [][] sopaDletras = new String[xFil][xCol];
        
        do{
            System.out.print(ctdad+"/5 Ingrese una palabra de 3 a 5 letras :");
            palabra=leer.next();
            if(palabra.length()>=3&&palabra.length()<=5){
                
                do{
                    fila=(int) (Math.random()*10)+1;
                    if(sopaDletras[fila][0]==null){
                        break;
                    }
                }while(true);
                
                for(int x=0;x<palabra.length();x++){
                    sopaDletras[fila][x] = palabra.substring(x,x+1);
                }
                ctdad++;
            }else{
                System.out.println("Error!!! intente de nuevo...");
            }
            
        }while (ctdad<6);

        
        for(int i=0; i<xFil; i++) {
            for(int j=0; j<xCol; j++) {
                if(sopaDletras[i][j]==null){
                    numAleatorio=(int)(Math.random()*10);
                    sopaDletras[i][j]=String.valueOf(numAleatorio);
                }
            }
        }
        
        // mostrar la matriz A e ir sumandos sus elementos
        System.out.println("Sopa de Letras");
        for(int i=0; i<xFil; i++) {
            for(int j=0; j<xCol; j++) {
                System.out.print(sopaDletras[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
