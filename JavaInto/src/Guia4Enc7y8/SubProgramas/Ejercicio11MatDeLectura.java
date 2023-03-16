/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
 */
package Guia4Enc7y8.SubProgramas;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class Ejercicio11MatDeLectura {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.print("Ingrese una Frase:");
        frase = leer.nextLine();
    
        System.out.print("Su frase codificada es : "+codifica(frase));
    }//Fin main
    
    public static String codifica(String frase){
        String caracter, codifica="";
        for(int x=0; x<frase.length()-1;x++){
            caracter=frase.substring(x,x+1);
            switch(caracter.toUpperCase()){
                case "A":
                    caracter="@";
                    break;
                case "E":
                    caracter="#";
                    break;
                case "I":
                    caracter="$";
                    break;
                case "O":
                    caracter="%";
                    break;
                case "U":
                    caracter="*";
                    break;    
            }
            codifica=codifica.concat(caracter);
        }
        return codifica;
    }
}//Fin class
