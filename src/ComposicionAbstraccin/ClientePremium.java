package ComposicionAbstraccin;

public class ClientePremium implements Cliente{

    @Override
    public void realizarCompra(Vendible producto) {
        System.out.println("Realizando compra para cliente Premium");
        double precioConDescuento = producto.calcularPrecio() * 0.10;
        System.out.println("Total a pagar con descuento: " + precioConDescuento);

    }
}
