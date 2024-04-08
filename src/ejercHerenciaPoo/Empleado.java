package ejercHerenciaPoo;

public class Empleado {

    private String nombre;
    private double salarioMensual;

    public Empleado() {
    }

    public Empleado(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    public double calcularSalarioAnual(){
        return salarioMensual*12;
    }
}
