
package Entidades;

import java.util.Scanner;

public class Ahorcado {
    private String[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private int jugadasRestantes;

    public void crearJuego() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la palabra a buscar: ");
        String palabraUsuario = sc.nextLine();
        this.palabra = palabraUsuario.split("");
        this.letrasEncontradas = 0;
        System.out.print("Ingresa la cantidad de jugadas máximas: ");
        this.jugadasMaximas = sc.nextInt();
        this.jugadasRestantes = this.jugadasMaximas;
    }

    public void longitud() {
        System.out.println("La longitud de la palabra es: " + this.palabra.length);
    }

    public boolean buscar(String letra) {
        boolean encontrado = false;
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i].equals(letra)) {
                encontrado = true;
                this.letrasEncontradas++;
            }
        }
        if (!encontrado) {
            this.jugadasRestantes--;
            System.out.println("La letra " + letra + " no está en la palabra.");
        } else {
            System.out.println("La letra " + letra + " está en la palabra.");
        }
        return encontrado;
    }

    public void encontradas(String letra) {
        int encontradas = 0;
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i].equals(letra)) {
                encontradas++;
            }
        }
        System.out.println("Se han encontrado " + encontradas + " letras " + letra + ".");
        System.out.println("Faltan encontrar " + (this.palabra.length - this.letrasEncontradas) + " letras.");
    }

    public void intentos() {
        System.out.println("Te quedan " + this.jugadasRestantes + " oportunidades.");
    }

    public void juego() {
        crearJuego();
        while (this.jugadasRestantes > 0 && this.letrasEncontradas < this.palabra.length) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa una letra: ");
            String letraUsuario = sc.nextLine();
            buscar(letraUsuario);
            encontradas(letraUsuario);
            intentos();
        }
        if (this.letrasEncontradas == this.palabra.length) {
            System.out.println("¡Felicidades! Has ganado.");
        } else {
            System.out.println("Lo siento, has perdido.");
        }
    }

}
