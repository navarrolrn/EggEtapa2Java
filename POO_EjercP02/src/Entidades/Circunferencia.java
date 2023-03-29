/*Declarar una clase llamada Circunferencia que tenga como atributo 
 *privado el radio de tipo real. A continuación, se deben crear 
 *los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
Método area(): para calcular el área de la circunferencia
(Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
package Entidades;

import java.util.Scanner;


public class Circunferencia {
    private double radio;

    public Circunferencia(){
        
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Indique el radio de la circunferencia");
        this.radio=leer.nextDouble();
        
    }
    
    public void area(){
        double area;
        area=Math.pow((3.1416*radio),2);
        System.out.println("El área de la circunferencia de radio "+radio+" es "+area);
    }
    
        public void perimetro(){
        double perimetro;
        perimetro=2*3.1416*radio;
        System.out.println("El Perímetro de la circunferencia de radio "+radio+" es "+perimetro);
    }

        
}
