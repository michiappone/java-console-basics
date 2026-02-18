package com.michiappone.javaconsolebasics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            
            mostrarMenu();
            opcion = leerOpcion(input);

            switch (opcion) {
                case 1:
                    sumar(input);
                    break;
                case 2:
                    restar(input);
                    break;
                case 3:
                    multiplicar(input);
                    break;
                case 4:
                    dividir(input);
                    break;
                case 5:
                    promedio(input);
                    break;                    
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);

        input.close();
    }

    private static int leerOpcion(Scanner Sc){
        int opcion;
        
        while (!Sc.hasNextInt()) {            
            System.out.println("Entrada invalida, intente de nuevo... ");
            Sc.next();
        }
        
        opcion = Sc.nextInt();
        Sc.nextLine(); // limpiar el ENTER pendiente
        
        return opcion;
        }
    
     private static double leerDouble(Scanner Sc, String mensaje){
        System.out.print(mensaje);
        while (!Sc.hasNextDouble()) {            
            System.out.println("Entrada invalida, intente de nuevo... ");
            Sc.next();
        }
        
        double valor = Sc.nextDouble();
        Sc.nextLine(); // limpiar el ENTER pendiente
        
        return valor;
        }
    
     private static int leerInt(Scanner Sc, String mensaje){
        System.out.print(mensaje);
        while (!Sc.hasNextInt()) {            
            System.out.println("Entrada invalida, intente de nuevo... ");
            Sc.next();
        }
        
        int valor = Sc.nextInt();
        Sc.nextLine(); // limpiar el ENTER pendiente
        
        return valor;
        }
     
    private static void mostrarMenu(){
        System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Calcular promedio de N números");
            System.out.println("0 - Salir");
            System.out.print("Elegí una opción: ");
    }
    
    private static void sumar(Scanner sc) {
        double a = leerDouble(sc, "Ingrese el primer número: ");
        double b = leerDouble(sc, "Ingrese el segundo número: ");
        System.out.println("Resultado: " + (a + b));
    }

    private static void restar(Scanner sc) {
        double a = leerDouble(sc, "Ingrese el primer número: ");
        double b = leerDouble(sc, "Ingrese el segundo número: ");
        System.out.println("Resultado: " + (a - b));
    }

    private static void multiplicar(Scanner sc) {
        double a = leerDouble(sc, "Ingrese el primer número: ");
        double b = leerDouble(sc, "Ingrese el segundo número: ");
        System.out.println("Resultado: " + (a * b));
    }

    private static void dividir(Scanner sc) {
        double a = leerDouble(sc, "Ingrese el dividendo: ");
        double b = leerDouble(sc, "Ingrese el divisor: ");        

        if (b == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("Resultado: " + (a / b));
        }
    }
    
    
    
    private static void promedio(Scanner sc){
        int cantidad = leerInt(sc, "Ingrese la cantidad de numeros que quiere almacenar: ");
        
        
        while (cantidad <= 0){
            System.out.println("Error. La cantidad de valores debe ser mayor a 0 ");
            cantidad = leerInt(sc, "Ingrese nuevamente...");
        }
        
        double[] numeros = new double[cantidad];
        double suma = 0;
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = leerDouble(sc, "Numero " + (i+1) + " :" );
            suma += numeros[i];
        }
        
        double promedio = suma / cantidad;
        System.out.println("Promedio: " + promedio);
    }
}
