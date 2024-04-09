package Mascota;

import java.util.Scanner;

public class Main {
    private static Mascota perrito;

    public static void main(String[] args) {
         perrito = new Mascota("pepe", 100, 23.4, 1, true, 1, 5);

        showMenu();
    }
        public static void showMenu() {
            Scanner leer = new Scanner(System.in);
            int op;
            do {
                System.out.println("eliga opcion 1-, 2-, 3-, 4-Salir");
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
                        System.out.println(perrito.estaVivo());
                        break;
                    case 5:
                        System.out.println("...");
                        break;
                    default:
                        System.out.println("Ingresa una opcion correcta");
                }
            } while (op != 4);
            {

            }


        }

}