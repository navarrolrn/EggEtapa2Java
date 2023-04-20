//En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
package cutilidad_ejera03;

import Servicio.ArregloService;

public class CUtilidad_EjerA03 {


    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        ArregloService.inicializarA(arregloA);
        ArregloService.mostrar(arregloA);
        ArregloService.ordenar(arregloA);
        ArregloService.inicializarB(arregloA, arregloB);
    }
    
}
