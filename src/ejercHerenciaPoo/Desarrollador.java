package ejercHerenciaPoo;

public class Desarrollador extends Empleado{

    private String lenguage;

    public Desarrollador(String lenguage) {
        this.lenguage = lenguage;
    }

    public Desarrollador(String nombre, double salarioMensual,String lenguage) {
        super(nombre,salarioMensual);
        this.lenguage = lenguage;
    }
}
