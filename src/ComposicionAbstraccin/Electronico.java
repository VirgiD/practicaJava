package ComposicionAbstraccin;

public class Electronico extends Producto{
    private String modelo;

    public Electronico(String nombre, double precioBase, String modelo) {
        super(nombre, precioBase);
        this.modelo = modelo;
    }

    @Override
    public double calcularPrecio() {
        // Precio base para productos electrónicos
        return precioBase;
    }
}
