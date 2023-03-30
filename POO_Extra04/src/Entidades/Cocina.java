
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Cocina {
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public  ArrayList<Receta> recetas; //cada nuevo objeto de "r":r0, r1,r2,r3;
                                       //se agrega un elemento al arraylist

    public Cocina() {
        this.recetas = new ArrayList();
    }
    // ob1.crearrecetas;
    public void crearRecetas(){
        int i;
        System.out.println("Ingrese nombre: ");
        String nombre = entrada.next();
        System.out.println("Cuantos ingredientes tiene su receta? ");
        int cantidad = entrada.nextInt();
        String [] ingredientes = new String [cantidad];
        for (i = 0; i < cantidad; i++) {
            System.out.println("Ingrese ingrediente numero : "+(i+1));
            ingredientes[i] = entrada.next();
        }
        Receta r = new Receta(nombre,ingredientes);
        // recetas 0 String nombre, String [] ingredientes;
        recetas.add(r);
    }
    public void buscarRecetas(){
       // arraylist [3] r0 r1 r2
       /// r0 nombre,ingrediente,auto;
       //
        System.out.println("Ingrese nombre de receta a buscar: ");
        String nombre = entrada.next();
        for (Receta r : recetas) {
            if (r.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(r);
            }
        }
    }
}
