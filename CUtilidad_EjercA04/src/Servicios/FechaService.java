package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    public static Date fechaNacimiento() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.print("Ingrese mes de nacimiento: ");
        int mes = leer.nextInt() - 1; // El mes se ingresa de 1 a 12, pero en Date se usa de 0 a 11
        System.out.print("Ingrese año de nacimiento: ");
        int anio = leer.nextInt() - 1900; // El año en Date se cuenta desde 1900
        return new Date(anio, mes, dia);
    }
    
    public static Date fechaActual() {
        return new Date();
    }
    
    public static int diferencia(Date fecha1, Date fecha2) {
        long diferenciaMS = fecha1.getTime() - fecha2.getTime();
        long diferenciaAnios = diferenciaMS / (1000L * 60L * 60L * 24L * 365L); // 1 año = 365 días
        return (int)diferenciaAnios;
    }

}
