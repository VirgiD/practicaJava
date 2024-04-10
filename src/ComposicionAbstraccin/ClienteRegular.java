package ComposicionAbstraccin;

public class ClienteRegular implements Cliente{

    @Override
    public void realizarCompra(Vendible producto) {
        System.out.println("Realizando compra para cliente regular");
        System.out.println("Total a pagar: " + producto.calcularPrecio());

    }
}
