package Ejercicios;
/*Diseña una aplicación que permita a un usuario administrar una lista de contactos. La aplicación deberá ser capaz de agregar nuevos contactos, buscar contactos existentes y mostrar la lista de todos los contactos almacenados. Utiliza dos arrays: uno para los nombres de los contactos y otro para los números de teléfono.

La aplicación debe incluir las siguientes funciones:

1. **`agregarContacto`**: Esta función debe permitir al usuario ingresar un nombre y un número de teléfono para un nuevo contacto y agregarlos a la lista de contactos.
2. **`buscarContacto`**: Esta función debe permitir al usuario buscar un contacto por nombre y mostrar la información del contacto si se encuentra. De lo contrario, mostrar un mensaje indicando que el contacto no se encontró.
3. **`mostrarContactos`**: Esta función debe mostrar la lista completa de contactos con sus nombres y números de teléfono.

El programa principal debe proporcionar un menú interactivo que permita al usuario seleccionar estas opciones y realizar las operaciones deseadas. Asegúrate de gestionar adecuadamente la capacidad de almacenamiento de contactos y proporcionar salidas claras y comprensibles.
* */
import java.util.Scanner;
public class ejercicioRegistroContactos {

            private static String[] nombres = new String[100];
            //declaro las variables estáticas para que sean accedidas desde métodos estáticos
            private static String[] telefonos = new String[100];
            private static int totalContactos = 0;

            //Métodos
            public static void agregarContacto(String nombre, String telefono) {
                //arreglos nombres, teléfonos
                nombres[totalContactos] = nombre;
                telefonos[totalContactos] = telefono;
                //sumo a la lista
                totalContactos++;
                System.out.println("Contacto agregado correctamente.");
            }

            public static void buscarContacto(String nombre) {
                boolean encontrado = false;
                for (int i = 0; i < totalContactos; i++) {
                    //recorre el arreglo nombres comparando utilizando equalsIgnoreCase
                    if (nombres[i].equalsIgnoreCase(nombre)) {
                        System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + telefonos[i]);
                        encontrado = true;
                        break;
                    }
                }
                //se verifica si la variable cambio de estado a true
                if (!encontrado) {
                    System.out.println("El contacto no se encontró.");
                }
            }
            public static void mostrarContactos() {
                if (totalContactos == 0) {
                    System.out.println("No hay contactos almacenados.");
                } else {
                    System.out.println("Lista de contactos:");
                    for (int i = 0; i < totalContactos; i++) {
                        System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + telefonos[i]);
                    }
                }
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                //a través del menú llamo a los métodos
                int opcion;
                do {
                    System.out.println("\nMenú de opciones:");
                    System.out.println("1. Agregar contacto");
                    System.out.println("2. Buscar contacto");
                    System.out.println("3. Mostrar todos los contactos");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            scanner.nextLine(); // Limpiar el buffer del teclado
                            System.out.print("Ingrese el nombre del contacto: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Ingrese el número de teléfono: ");
                            String telefono = scanner.nextLine();
                            agregarContacto(nombre, telefono);
                            break;
                        case 2:
                            scanner.nextLine(); // Limpiar el buffer del teclado
                            System.out.print("Ingrese el nombre del contacto a buscar: ");
                            String nombreBuscar = scanner.nextLine();
                            buscarContacto(nombreBuscar);
                            break;
                        case 3:
                            mostrarContactos();
                            break;
                        case 4:
                            System.out.println("¡Hasta luego!");
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    }
                } while (opcion != 4);

                scanner.close();
            }
        }


