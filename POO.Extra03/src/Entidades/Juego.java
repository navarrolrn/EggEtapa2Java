/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer 
jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una 
pista de "más alto" o "más bajo" después de cada intento. 
El juego termina cuando el segundo jugador adivina el número o 
se queda sin intentos. Registra el número de intentos necesarios para 
adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidades;

import java.util.Scanner;


public class Juego {
    public int num1;
    public int num2;
    public int intentos;

    public Juego() {
    }
    
    public void iniciarJuego(){
        Scanner leer=new Scanner(System.in);
        int j1gana=0;
        int j2gana=0;
        String seguir="";
        do{            
            intentos=0;
            System.out.println("Jugador 1 Indique un número: ");
            num1=leer.nextInt();
            do{
                System.out.println("Jugador 2 Intenta adivinar el número: ");
                num2=leer.nextInt();
                intentos++;
                if(num2>num1){
                    System.out.println("El número es más bajo, siga intentando...");
                }else {
                    System.out.println("El número es más alto, siga intentando...");
                }
            }while (intentos<5 && num1!=num2);
            if(num1==num2){
               System.out.println("Usted acertó en el intento "+intentos);
               j2gana++;
            }else {
                System.out.println("No adivinaste y se agotó el número d intentos");
                j1gana++;
            }
            System.out.println("Desea jugar nuevamente? S/N ");
            seguir=leer.next();
        }while (seguir.equalsIgnoreCase("S"));
        System.out.println("Jugador 1 ganó "+j1gana+" veces");
        System.out.println("Jugador 2 ganó "+j2gana+" veces");

    }
    
}
