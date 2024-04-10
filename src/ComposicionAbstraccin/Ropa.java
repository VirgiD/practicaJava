package ComposicionAbstraccin;

public class Ropa extends Producto{
    private String talla;

    public Ropa(String nombre, double precioBase, String talla) {
        super(nombre, precioBase);
        this.talla = talla;
    }

    @Override
    public double calcularPrecio() {
        // Precio base para ropa
        return precioBase;
    }
}
