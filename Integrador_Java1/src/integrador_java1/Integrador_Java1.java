
package integrador_java1;

import Entidad.Estudiante;
import Servicio.EstudianteService;

public class Integrador_Java1 {

    public static void main(String[] args) {
        EstudianteService es=new EstudianteService();
        Estudiante [] est=new Estudiante [8];
        for (int i = 0; i < est.length; i++) {
            est[i]=es.crearEstudiante();
        }
        es.mostrarEstudiantes(est);
        es.mostrarVectorEstudiantes(est, es.nombreEstudiantesPromedioMayor(est));
    }
    
}
