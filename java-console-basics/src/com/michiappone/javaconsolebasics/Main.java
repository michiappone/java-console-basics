package com.michiappone.javaconsolebasics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Salir");
            System.out.print("Elegí una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sumar(sc);
                    break;
                case 2:
                    restar(sc);
                    break;
                case 3:
                    multiplicar(sc);
                    break;
                case 4:
                    dividir(sc);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);

        sc.close();
    }

    private static void sumar(Scanner sc) {
        System.out.print("Ingrese el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = sc.nextDouble();
        System.out.println("Resultado: " + (a + b));
    }

    private static void restar(Scanner sc) {
        System.out.print("Ingrese el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = sc.nextDouble();
        System.out.println("Resultado: " + (a - b));
    }

    private static void multiplicar(Scanner sc) {
        System.out.print("Ingrese el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = sc.nextDouble();
        System.out.println("Resultado: " + (a * b));
    }

    private static void dividir(Scanner sc) {
        System.out.print("Ingrese el dividendo: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("Resultado: " + (a / b));
        }
    }
}
