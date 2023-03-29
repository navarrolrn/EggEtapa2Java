/*
 *Crear una clase llamada Libro que contenga los siguientes atributos:
 *ISBN, Título, Autor, Número de páginas, y un constructor con todos los
 *atributos pasados por parámetro y un constructor vacío. Crear un método
 *para cargar un libro pidiendo los datos al usuario y luego informar 
 *mediante otro método el número de ISBN, el título, el autor del libro
 *y el número de páginas.

*/
package poo_ejerciciospracticos;

import java.util.Scanner;


public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int numeroPags;

    public Libro(int isbn, String titulo, String autor, int numeroPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPags = numeroPags;
    }
    
    public Libro() {
    }
    
    
    public void CargarLibro(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Los Datos del Libro :");
        System.out.println("ISBN : ");
        this.isbn=leer.nextInt();
        System.out.println("Titulo : ");
        this.titulo=leer.next();
        System.out.println("Autor : ");
        this.autor=leer.next();
        System.out.println("Número de páginas : ");
        this.numeroPags=leer.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPags=" + numeroPags + '}';
    }

}
