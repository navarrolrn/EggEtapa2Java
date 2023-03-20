/*
 *Los profesores del curso de programación de Egg necesitan llevar un registro de 
 *las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
 *Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos
 *y 2 por parciales. Las ponderaciones de cada nota son:
 *Primer trabajo práctico evaluativo 10%
 *Segundo trabajo práctico evaluativo 15%
 *Primer Integrador 25%
 *Segundo integrador 50%
 *Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
 *Al final del programa los profesores necesitan obtener por pantalla la cantidad 
 *de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con 
 *promedio mayor o igual al 7 de sus notas del curso.

 */
package Guia5Enc9al11.ArreglosyVect;

import java.util.Scanner;


public class EjercXtra04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nAlumnos=10;
        int aprobados = 0;
        int desaprobados = 0;
        double promedio;

        // Creamos un arreglo para almacenar las notas de los 10 alumnos
        double[][] notas = new double[nAlumnos][5];

        //Se cargan las notas de cada alumno
        for (int i = 0; i < nAlumnos; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1));
            System.out.print("Primer trabajo práctico evaluativo: ");
            notas[i][0] = leer.nextDouble();
            System.out.print("Segundo trabajo práctico evaluativo: ");
            notas[i][1] = leer.nextDouble();
            System.out.print("Primer integrador: ");
            notas[i][2] = leer.nextDouble();
            System.out.print("Segundo integrador: ");
            notas[i][3] = leer.nextDouble();
            
            //Se calcula el promedio
            promedio = (notas[i][0] * 0.1) + (notas[i][1] * 0.15) + (notas[i][2] * 0.25) + (notas[i][3] * 0.5);

            //Se guarda el promedio en el arreglo
            notas[i][4] = promedio;
        }
        
        //Se muestra la matriz con los valores cargados
        System.out.println("Alumno   Pact1   Pact2   Int1   Int2   Nota Final");
        for (int i = 0; i < nAlumnos; i++) {
            System.out.println("   "+(i+1)+"      "+notas[i][0]+"     "+notas[i][1]+"    "+notas[i][2]+"     "+notas[i][3]+"      "+notas[i][4]);
            if (notas[i][4] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        //Se muestra la cantidad de Aprobados y Desaprobados
        
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
        
    }//Fin main
}//Fin class
