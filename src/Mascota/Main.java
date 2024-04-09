package Mascota;

import java.util.Scanner;

public class Main {
    private static Mascota perrito;

    public static void main(String[] args) {
         perrito = new Mascota("pepe", 5, 23.4, 1, true, 1, 5);

        showMenu();
    }
        public static void showMenu() {
            Scanner leer = new Scanner(System.in);
            int op;
            do {
                System.out.println("eliga opcion 1-, 2-, 3-,4-, 5-, 6-, 7-, 8-Salir");
                System.out.println("ingrese el valor: ");
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        perrito.comer();
                        break;
                    case 2:
                       perrito.dormir();
                        break;
                    case 3:
                        perrito.despertar();
                        break;
                    case 4:
                        perrito.caminar();
                        break;
                    case 5:
                        perrito.correr();
                        break;
                    case 6:
                        perrito.obtenerEnergia();
                        break;
                    case 7:
                        System.out.println(perrito.estaVivo());
                        break;
                    case 8:
                        System.out.println("...");
                        break;
                    default:
                        System.out.println("Ingresa una opcion correcta");
                }
            } while (op != 8);
            System.out.println("juego terminado");
            {

            }
    }

}