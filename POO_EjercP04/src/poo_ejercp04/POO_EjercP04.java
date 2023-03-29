
package poo_ejercp04;

import Entidades.Rectangulo;


public class POO_EjercP04 {


    public static void main(String[] args) {
        Rectangulo caja=new Rectangulo();
        caja.crearRectangulo();
        System.out.println("La Superficie es: "+caja.superficie());
        System.out.println("El perímetro es: "+caja.perimetro());
        System.out.println("Rectángulo");
        caja.dibujaRectangulo();
    }
    
}
