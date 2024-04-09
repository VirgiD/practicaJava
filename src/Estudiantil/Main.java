package Estudiantil;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(15,"Juan");
        estudiante1.setCalificaciones(80);
        estudiante1.setCalificaciones(100);
        estudiante1.setCalificaciones(70);
        estudiante1.imprimirCalificaciones();


        double promedio = estudiante1.calcularPromedio();
        System.out.println("El promedio de calificaciones de " + estudiante1.getNombre() + " es: " + promedio);
    }
}
