
package Entidades;

import java.util.Scanner;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {
        // Constructor por defecto
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        // Constructor con todos los atributos como parámetro
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    // Métodos getters y setters de cada atributo
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    // Método cargarAlumnos()
    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            alumnos[i] = scanner.nextLine();
        }
    }

    // Método crearCurso()
    public void crearCurso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso:");
        nombreCurso = scanner.nextLine();
        System.out.println("Ingrese la cantidad de horas por día:");
        cantidadHorasPorDia = scanner.nextInt();
        System.out.println("Ingrese la cantidad de días por semana:");
        cantidadDiasPorSemana = scanner.nextInt();
        System.out.println("Ingrese el turno (mañana o tarde):");
        turno = scanner.next();
        System.out.println("Ingrese el precio por hora:");
        precioPorHora = scanner.nextDouble();
        alumnos = new String[5];
        cargarAlumnos();
    }

    // Método calcularGananciaSemanal()
    public double calcularGananciaSemanal() {
        return cantidadHorasPorDia * precioPorHora * alumnos.length * cantidadDiasPorSemana;
    }
}