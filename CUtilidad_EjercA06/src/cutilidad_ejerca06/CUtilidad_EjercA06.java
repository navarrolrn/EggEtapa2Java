
package cutilidad_ejerca06;

import Entidades.Curso;


public class CUtilidad_EjercA06 {


    public static void main(String[] args) {
        Curso cursos=new Curso();
        cursos.crearCurso();
        System.out.println("La ganancia semanal es de: "+cursos.calcularGananciaSemanal());
    }
    
}
