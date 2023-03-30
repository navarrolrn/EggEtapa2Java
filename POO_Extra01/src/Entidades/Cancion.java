/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author leonn
 */
public class Cancion {
    //Atributos
    public String titulo;
    public String autor;
    
    //Construtores

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Setter y Getter

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    //Metodos
    public void crearCancion(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese título de la canción : ");
        titulo=leer.next();
        System.out.println("Ingrese el autor de la canción : ");
        autor=leer.next();    
    }
    
    @Override
    public String toString() {
        return "Cancion{" + "El título es " + titulo + " y el autor es " + autor  + '}';
    }
    
    
}
