package Ejercicios;

import java.util.Scanner;

/*- Ejercicio N1 - **Análisis de Datos**
    **Programa de Análisis de Datos**
    Diseña un programa en Java que permita a un usuario ingresar una serie de números y realice un análisis de esos datos. El programa debe incluir las siguientes funciones:

    1. **`encontrarMaximo`**: Esta función debe tomar un arreglo de números como entrada y encontrar el número máximo en el conjunto. Devuelve el número máximo encontrado.
    2. **`encontrarMinimo`**: Esta función debe tomar un arreglo de números como entrada y encontrar el número mínimo en el conjunto. Devuelve el número mínimo encontrado.
    3. **`calcularPromedio`**: Esta función debe calcular y devolver el promedio de los números en el conjunto.
    4. **`contarNumerosPares`**: Esta función debe contar la cantidad de números pares en el conjunto y devolver ese número.

    El programa principal debe realizar lo siguiente:

    - Solicitar al usuario la cantidad de números que desea ingresar.
    - Pedir al usuario que ingrese los números uno por uno y almacenarlos en un arreglo.
    - Utilizar las funciones mencionadas para calcular y mostrar lo siguiente:
        - El número máximo en el conjunto.
        - El número mínimo en el conjunto.
        - El promedio de los números en el conjunto.
        - La cantidad de números pares en el conjunto.

    El programa debe ser modular y utilizar las funciones mencionadas para llevar a cabo estas tareas. Asegúrate de manejar adecuadamente las entradas de usuario y proporcionar salidas claras y comprensibles.
* */

public class ejercicioArrelgo1 {

            public static int encontrarMaximo(int[] numeros) {
                int maximo = Integer.MIN_VALUE;
                for (int num : numeros) {
                    if (num > maximo) {
                        maximo = num;
                    }
                }
                return maximo;
            }

            public static int encontrarMinimo(int[] numeros) {
                int minimo = Integer.MAX_VALUE;
                for (int num : numeros) {
                    if (num < minimo) {
                        minimo = num;
                    }
                }
                return minimo;
            }

            public static double calcularPromedio(int[] numeros) {
                if (numeros.length == 0) {
                    return 0;
                }
                int suma = 0;
                for (int num : numeros) {
                    suma += num;
                }
                return (double) suma / numeros.length;
            }

            public static int contarNumerosPares(int[] numeros) {
                int contadorPares = 0;
                for (int num : numeros) {
                    if (num % 2 == 0) {
                        contadorPares++;
                    }
                }
                return contadorPares;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Ingrese la cantidad de números:");
                int cantidadNumeros = scanner.nextInt();

                int[] numeros = new int[cantidadNumeros];

                System.out.println("Ingrese los números uno por uno:");

                for (int i = 0; i < cantidadNumeros; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }

                int maximo = encontrarMaximo(numeros);
                int minimo = encontrarMinimo(numeros);
                double promedio = calcularPromedio(numeros);
                int cantidadPares = contarNumerosPares(numeros);

                System.out.println("\nResultados del análisis:");
                System.out.println("Número máximo: " + maximo);
                System.out.println("Número mínimo: " + minimo);
                System.out.println("Promedio: " + promedio);
                System.out.println("Cantidad de números pares: " + cantidadPares);

                scanner.close();
            }
        }


