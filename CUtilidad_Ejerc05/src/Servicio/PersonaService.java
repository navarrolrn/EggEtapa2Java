package servicio;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    public static Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento de la persona (dd/mm/aaaa): ");
        String fechaStr = sc.nextLine();
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = new Date(fechaStr);
        } catch (Exception e) {
            System.out.println("Error al ingresar la fecha de nacimiento. " + e.getMessage());
        }
        return new Persona(nombre, fechaNacimiento);
    }

    public static int calcularEdad(Date fechaNacimiento) {
        Date fechaActual = new Date();
        long diferenciaMS = fechaActual.getTime() - fechaNacimiento.getTime();
        long diferenciaAnios = diferenciaMS / (1000L * 60L * 60L * 24L * 365L);
        return (int) diferenciaAnios;
    }

    public static boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona.getFechaNacimiento());
        return edadPersona < edad;
    }

    public static void mostrarPersona(Persona persona) {
        int edad = calcularEdad(persona.getFechaNacimiento());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + edad);
        System.out.println(menorQue(persona,18)+" es menor de edad");
    }
    
}

