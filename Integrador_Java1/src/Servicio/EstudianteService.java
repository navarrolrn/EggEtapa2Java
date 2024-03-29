
package Servicio;

import Entidad.Estudiante;
import java.util.Arrays;
import java.util.Scanner;

public class EstudianteService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante crearEstudiante(){
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre=sc.next();
        System.out.print("Ingrese la nota del alumno: ");
        double nota=sc.nextDouble();
        return new Estudiante(nombre, nota);
    }
    
    public double promedioEstudiante(Estudiante [] est){
        double retorno=0;
        for (int i = 0; i < est.length; i++) {
            retorno=retorno+est[i].getNota();
        }
        return (retorno/est.length);
    }
    
    public String [] nombreEstudiantesPromedioMayor(Estudiante [] est){
        int n=0, j=0;
        System.out.println("El promedio del curso es: "+promedioEstudiante(est));
        for (int i = 0; i < est.length; i++) {
            if (est[i].getNota()>=(promedioEstudiante(est))) {
                n++;
            }
        }
        String []estMayorPromedio=new String [n];
        for (int i = 0; i < est.length; i++) {
            if (est[i].getNota()>=(promedioEstudiante(est))) {
                estMayorPromedio[j]=est[i].getNombre();
                j++;
            }
        }
        return estMayorPromedio;
    }
    
    public void mostrarEstudiantes (Estudiante [] est){
        System.out.println("Se imprime los Alumnos con sus respectivas notas: ");
        System.out.println(Arrays.toString(est));
    }
    
    public void mostrarVectorEstudiantes (Estudiante[] est, String [] vec){
        System.out.println("Se imprime los nombres de los Alumnos con notas superiores al promedio: "+promedioEstudiante(est));
        System.out.println(Arrays.toString(vec));
    }
}
