package edu.ejercicios;

import java.util.Scanner;

public class LongitudArray {
    public static void main(String[] args) {
        // Solicitar al usuario la longitud del array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del array: ");
        int longitud = scanner.nextInt();

        // Crear un array con la longitud proporcionada
        int[] numeros = new int[longitud];

        // Permitir al usuario insertar números entre 0 y 10
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese un número entre 0 y 10 para la posición " + i + ": ");
            int numero = scanner.nextInt();

            // Validar que el número esté en el rango correcto
            if (numero >= 0 && numero <= 10) {
                numeros[i] = numero;
            } else {
                System.out.println("Número fuera del rango. Ingrese un número entre 0 y 10.");
                i--; // Decrementar el índice para volver a solicitar el número en la misma posición
            }
        }

        // Mostrar los números por pantalla
        System.out.println("Array generado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
