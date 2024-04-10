package ComposicionAbstraccin;

public class Comestible extends Producto{
    private int diasCaducidad;

    public Comestible(String nombre, double precioBase, int diasCaducidad) {
        super(nombre, precioBase);
        this.diasCaducidad = diasCaducidad;
    }

    @Override
    public double calcularPrecio() {
        // Precio base para productos comestibles
        return precioBase;
    }
}
