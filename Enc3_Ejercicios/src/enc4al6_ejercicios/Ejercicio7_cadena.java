/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo 
lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de 
un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” 
marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el 
formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals()
 */
package encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio7_cadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String FDE;
        int cont = 0;
        int cont1 = 0;
        String priCaract="",segCaract="";

        do {
            System.out.println("Ingrese cadenas de 5 caracteres");
            FDE = leer.nextLine();
            int longi = FDE.length();
            if (longi==5){
                priCaract = FDE.substring(0, 1);
                segCaract = FDE.substring(4, 5);
            }
       
            if (priCaract.equalsIgnoreCase("X") && segCaract.equalsIgnoreCase("O") && longi == 5) {

                cont++;
            } else {

                cont1++;
            }
        
        } while (!FDE.equalsIgnoreCase( "&&&&&"));
        cont1--;
        System.out.println("Cantidad de lecturas correctas: " + cont);
        System.out.println("Cantidad de lecturas incorrectas: " + cont1);
    }

}
