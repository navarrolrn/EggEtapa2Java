/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package Servicio;

import java.util.Arrays;

/**
 *
 * @author leonn
 */
public class ArregloService {
    public static void inicializarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.round(Math.random()*100.0)/100.0;
        }
    }

    public static void mostrar(double[] arregloA) {
        System.out.println(Arrays.toString(arregloA));
    }

    public static void ordenar(double[] arregloA) {
        Arrays.sort(arregloA);
        double[] alreves = new double[arregloA.length];
        for (int i = 0; i < arregloA.length; i++) {
            alreves[i] = arregloA[arregloA.length - i - 1];
        }
        System.out.println(Arrays.toString(alreves));
    }

    double[] arregloB = new double[20];

    public static void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, 20, 0.5);
        System.out.println( Arrays.toString(arregloB));
    }
}



