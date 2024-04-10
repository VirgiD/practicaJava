package ComposicionAbstraccin;


import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
    private List<Vendible> productos;

    public CarritoDeCompra() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Vendible producto) {
        productos.add(producto);
    }

    public double calcularTotal(Cliente cliente) {
        double total = 0;
        for (Vendible producto : productos) {
            total += producto.calcularPrecio();
        }
        if (cliente instanceof ClientePremium) {
            // Aplicar descuento para cliente premium
            total *= 0.10;
        }
        return total;
    }
}

