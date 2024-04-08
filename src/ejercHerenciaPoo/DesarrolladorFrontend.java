package ejercHerenciaPoo;

public class DesarrolladorFrontend extends Desarrollador{
    private String[] tecnologiasFrontend;

    public DesarrolladorFrontend(String nombre, double salarioMensual, String lenguage, String[] tecnologiasFrontend) {
        super(nombre, salarioMensual, lenguage);
        this.tecnologiasFrontend = tecnologiasFrontend;
    }

    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() + 1000; //agrego un extra
    }

}
