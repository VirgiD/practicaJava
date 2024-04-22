package ComposicionAbstraccin;
/*
### **Ejercicio 3: Sistema de Tienda con Composición, Interface y Abstracción**

Diseña un sistema para una tienda que utilice conceptos de composición, interfaces y abstracción para modelar
 la interacción entre diferentes elementos de la tienda. Utiliza clases abstractas e interfaces para representar
 diferentes roles y responsabilidades.
1. **Interfaz `Vendible`:**
    - Crea una interfaz llamada **`Vendible`** que declare un método **`calcularPrecio`**.
2. **Clase Abstracta `Producto` e Implementación en Subclases:**
    - Define una clase abstracta **`Producto`** que implemente la interfaz **`Vendible`**. Esta clase debería contener atributos comunes como nombre y precio base.
    - Crea subclases de **`Producto`** como **`Ropa`**, **`Electronico`** y **`Comestible`** que representen diferentes tipos de productos. Cada subclase debería tener atributos específicos y sobrescribir el método **`calcularPrecio`** según sus propias reglas.
3. **Interfaz `Cliente`:**
    - Crea una interfaz llamada **`Cliente`** que declare un método **`realizarCompra`** que toma un objeto **`Vendible`**.
4. **Clase `ClienteRegular` y `ClientePremium`:**
    - Implementa dos clases que implementen la interfaz **`Cliente`**: **`ClienteRegular`** y **`ClientePremium`**. Cada una debería tener un método para realizar una compra, y el cliente premium puede tener beneficios adicionales, como descuentos.
5. **Clase `CarritoCompra`:**
    - Crea una clase llamada **`CarritoCompra`** que contiene una lista de objetos **`Vendible`** y métodos para agregar productos al carrito, calcular el total y aplicar descuentos si el cliente es premium.
 */
public class Tienda {
    public static void main(String[] args) {
        // Ejemplo
        Ropa camisa = new Ropa("Camisa", 50.0, "M");
        Electronico telefono = new Electronico("Teléfono", 500.0, "iPhone 13");
        Comestible fruta = new Comestible("Manzana", 1.0, 7);

        ClienteRegular clienteRegular = new ClienteRegular();
        ClientePremium clientePremium = new ClientePremium();

        CarritoDeCompra carrito = new CarritoDeCompra();
        carrito.agregarProducto(camisa);
        carrito.agregarProducto(telefono);
        carrito.agregarProducto(fruta);

        // Cliente regular realiza compra
        System.out.println("Cliente Regular:");
        double totalRegular = carrito.calcularTotal(clienteRegular);
        System.out.println("Total a pagar: " + totalRegular);

        // Clinte premium
        System.out.println("Cliente Premium:");
        double totalPremium = carrito.calcularTotal(clientePremium);
        System.out.println("Total a pagar: " + totalPremium);
    }
}
