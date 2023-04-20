/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos 
una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente. 
Agregar getters y setters. 
El constructor con frase como atributo debe setear la longitud de la frase de manera automática.
 */
package Entidades;

public class Cadena {
    //atributos
    private String frase;
    private int largo;
    
    //contructores

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.largo=frase.length();
    }
    
    //Setter y Getter

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.largo=frase.length();
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(String frase) {
        this.largo = frase.length();
    }

    
    
}
