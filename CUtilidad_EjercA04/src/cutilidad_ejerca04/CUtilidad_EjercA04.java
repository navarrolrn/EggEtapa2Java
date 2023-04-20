package cutilidad_ejerca04;

import Servicios.FechaService;
import java.util.Date;

public class CUtilidad_EjercA04 {

    public static void main(String[] args) {
        Date fechaNacimiento = FechaService.fechaNacimiento();
        Date fechaActual = FechaService.fechaActual();
        int edad = FechaService.diferencia(fechaActual, fechaNacimiento);
        System.out.println("Su edad es: " + edad + " años");
    }
}
