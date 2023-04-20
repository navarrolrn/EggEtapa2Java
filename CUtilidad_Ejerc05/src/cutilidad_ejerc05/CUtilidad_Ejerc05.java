
package cutilidad_ejerc05;

import entidades.Persona;
import servicio.PersonaService;

public class CUtilidad_Ejerc05 {

    public static void main(String[] args) {
        Persona persona=PersonaService.crearPersona();
        PersonaService.mostrarPersona(persona);
        
    }
    
}
