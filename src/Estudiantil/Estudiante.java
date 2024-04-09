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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
