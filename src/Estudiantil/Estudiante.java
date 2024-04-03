package Estudiantil;

import java.util.ArrayList;

public class Estudiante {

    private int edad;
    private String nombre;
    private ArrayList<Double>calificaciones;

    double calificacion;

    public Estudiante() {
    }

    public Estudiante(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public void setCalificaciones(double calificacion){
        calificaciones.add(calificacion);
    }


    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;

        }
        return suma / calificaciones.size();

    }


    public void imprimirCalificaciones() {
        System.out.println("Calificaciones de " + nombre + ":");
        for (double calificacion : calificaciones) {
            System.out.println(calificacion);
        }
    }

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(15,"Juan");
        estudiante1.setCalificaciones(80);
        estudiante1.setCalificaciones(100);
        estudiante1.setCalificaciones(70);
        estudiante1.imprimirCalificaciones();


        double promedio = estudiante1.calcularPromedio();
        System.out.println("El promedio de calificaciones de " + estudiante1.nombre + " es: " + promedio);
    }




}
