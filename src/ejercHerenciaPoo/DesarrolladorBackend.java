package ejercHerenciaPoo;

public class DesarrolladorBackend extends Desarrollador {

    private String [] tecnologiaBackend;

    public DesarrolladorBackend(String lenguage, String[] tecnologiaBackend) {
        super(lenguage);
        this.tecnologiaBackend = tecnologiaBackend;
    }

    public DesarrolladorBackend(String nombre, double salarioMensual, String lenguage, String[] tecnologiaBackend) {
        super(nombre, salarioMensual, lenguage);
        this.tecnologiaBackend = tecnologiaBackend;
    }

    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() + 2000; // agrego un extra por cargo
    }
}