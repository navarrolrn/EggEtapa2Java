//Esta clase contiene el metodo main
//desde acá se llama todo lo que se necesite llamar
package mascotapp;
// 1er ejemplo : import mascotapp.entidades.Perro;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
        /* Ejemplo 1, así se crea un perro y se guarda en la variable p1
         Perro p1=new Perro();
        Así creamos otro perro en la variable p2
        Perro p2=new Perro();
         */

        Scanner leer=new Scanner(System.in);
            
        Mascota m1 = new Mascota("Fernando", leer.next(), "Perro");
        
        
        // Se puede cambiar el contenido del atributo si estos fueron declarados como públicos
//        m1.nombre="Pepe Chiquito"; //Esta línea da error se genera por haber cambiado el atributo a private
        
        //Para encapsularlo se debe cambiar a private en el molde y así evitar cambiarlo
        //Para modificarlo debemos usar el Set en el molde
        m1.setNombre("Pepe Chiquito");

        //Agregamos un metodo pasear que ira restando la energía según pasee el perro
        m1.pasear(100);

        System.out.println(m1.getNombre());
        
        //Si solo coloco como referencia la variable m1 me mostrará el espacio en memoria donde está almacenada esta variable
        //Pero si agrego el toString me mostrará todos los atributos
        System.out.println(m1);
        
        /* Esto se uso de Ejemplo, como ya se hicieron los constructores, esto no va mas
        m1.apodo="Chiquito";
        m1.nombre=leer.next();
        m1.tipo="Perro";
        m1.edad=14;
        m1.raza="Beagle";
        m1.cola=true;
        m1.color="Tricolor";      

        System.out.println(m1.nombre+" "+m1.apodo+" "+m1.edad+" "+m1.tipo);
        */
        
    }

}
