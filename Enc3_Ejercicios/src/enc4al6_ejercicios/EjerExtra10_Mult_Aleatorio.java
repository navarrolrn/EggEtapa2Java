/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados 
aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que 
la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este 
ejercicio investigue como utilizar la función Math.random() de Java.
 */
package Extras;

import java.util.Scanner;


public class EjerExtra10_Mult_Aleatorio {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int resp, mult, n1, n2;
        n1 = (int) (Math.random()*11);
        n2 = (int) (Math.random()*11);
        mult=n1*n2;
        
        do {            
            System.out.println("Ingrese el resultado que ud piensa que dió la multiplicacion");
            resp = leer.nextInt();
            if (resp==mult) {
                System.out.println("Su respuesta es Correcto");
                break;
            }else{
                System.out.println("Su respuesta es Icorrecto");
            }
            
        } while (!(resp==mult));
  
        System.out.println("" +n1+ " x " +n2+ " = " +mult);
        
    }
    
}
