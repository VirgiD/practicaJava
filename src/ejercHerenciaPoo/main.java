package ejercHerenciaPoo;

public class main {
    public static void main(String[] args) {
        // Creo instancias de Empleado, Gerente y Desarrollador
        Empleado empleado1 = new Empleado("Juan", 3000);
        Gerente gerente1 = new Gerente("Ana", 5000, 2000);
        Desarrollador desarrollador1 = new Desarrollador("Pedro", 4000, "Python");

        // Muestro el salario anual de cada empleado
        System.out.println("Salario anual de " + empleado1 + ": $" + empleado1.calcularSalarioAnual());
        System.out.println("Salario anual de " + gerente1 + ": $" + gerente1.calcularSalarioAnual());
        System.out.println("Salario anual de " + desarrollador1 + ": $" + desarrollador1.calcularSalarioAnual());

    }
}
