package practicaLogica;

import java.util.Scanner;

//  **Ejercicio 1: Calculadora de IMC (Índice de Masa Corporal)**
//  Crea un programa que solicite al usuario ingresar su peso (en kilogramos) y su altura (en metros).
//  Luego, calcula el IMC (peso / altura^2) y muestra un mensaje indicando si la persona tiene
//  un peso bajo, normal, sobrepeso o obesidad, según los valores típicos del IMC.
public class Logica {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double peso, altura, IMC;

        System.out.println("Ingrese su peso");
        peso = teclado.nextDouble();
        System.out.println("Ingrese su altura");
        altura = teclado.nextDouble();

        IMC= peso/(altura*altura);

        if( IMC >=18 && IMC <= 25 ){
            System.out.println("Usted esta en peso normal");

        }else if (IMC < 18){
            System.out.println("Usted tiene bajo peso");

        }else if(IMC > 25 && IMC < 30){
            System.out.println("Usted posee sobre peso");

        }else
            System.out.println("Usted posee obesidad");
        System.out.println ("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        // **Ejercicio 2: Conversor de Monedas**
        // Desarrolla un programa que permita al usuario convertir una cantidad de pesos argentinos a
        // dolares. El usuario debe ingresar la cantidad en pesos, y el programa debe realizar la
        // conversión y mostrar el resultado. Utiliza una tasa de conversión fija.

        double pesos, dolares, taza;
        System.out.println("Ingrese el monto que desea convertir a dolar");
        pesos = teclado.nextDouble();
        taza = 0.0012;

        dolares = taza * pesos;

        System.out.println("la cantidad de dolares es igual a :" + dolares );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //**Ejercicio 3: Validación de Contraseña**
        //Crea un programa que solicite al usuario ingresar una contraseña. El programa debe validar
        // la contraseña según el criterio de una longitud mínima caracteres. Ingrese nuevamente la
        // contraseña y corroborar que ambas sean iguales


        String contrasena, contrasena2;
        int longMinima = 8;

        do {
            System.out.println("Ingrese su contraseña");
            contrasena = teclado.nextLine();
            if (contrasena.length() == longMinima) {
                System.out.println("la contraseña cumple con la long minima");
            }else{
                System.out.println("la contraseña no cumple con la longitud minima");
            }
        } while (contrasena.length() < longMinima);

        do {
            System.out.println("Ingrese nuevamente la contraseña para confirmar");
            contrasena2 = teclado.nextLine();

            if(contrasena.equals(contrasena2)){
                System.out.println("bienvenido al sistema");
                break;
            }else
                System.out.println("contraseña incorrecta");

        }while (contrasena != contrasena2) ;

        System.out.println("**************************************************************");

        //  **Ejercicio 4: Ordenar Tres Números**
        //  Escribe un programa que solicite al usuario ingresar tres números. El programa debe utilizar
        //  sentencias **`if-else`** para determinar y mostrar los números en orden ascendente.

        int num1,num2,num3;

        System.out.println("Ingrese tres numeros y el sistema los ordenara de forma ascendente");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        if(num1 < num2 && num2 < num3){
            System.out.println( num1 + " " + num2 + " " + num3);

        }else if(num1 < num3 && num2 > num3){
            System.out.println( num1 + " " + num3 + " " + num2);
        }else if (num3 < num1 && num1 < num2){
            System.out.println( num3 +" "+ num1 + " "+ num2);
        }else{
            System.out.println(num3 + " "+ num2 + " "+num1);
        }


    }
}
