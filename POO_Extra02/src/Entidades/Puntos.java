/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos 
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al 
usuario los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. 
Para conocer como calcular la distancia entre dos puntos consulte el 
siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author leonn
 */
public class Puntos {
    //Atributos
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    
    //Contructores

    public Puntos() {
    }

    public void crearPuntos(){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el punto a: ");
        x1=leer.nextInt();
        System.out.println("Ingrese el punto b: ");
        y2=leer.nextInt();
        System.out.println("Ingrese el punto c: ");
        x2=leer.nextInt();
        System.out.println("Ingrese el punto d: ");
        y1=leer.nextInt();

    }

    public double distanciaPuntos(){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    
}
