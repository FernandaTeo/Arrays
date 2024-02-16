package edu.ejercicios;

import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        // Crear un array con las letras del abecedario en mayúsculas
        char[] abecedario = new char[26];
        for (int i = 0; i < 26; i++) {
            abecedario[i] = (char) ('A' + i);
        }

        // Permitir al usuario seleccionar letras hasta que inserte -1
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar las letras por pantalla
            System.out.println("Letras del abecedario:");

            for (int i = 0; i < abecedario.length; i++) {
                System.out.print(abecedario[i] + " ");
            }

            // Solicitar al usuario que seleccione una letra o inserte -1
            System.out.print("\nIngrese el índice de la letra que desea (o -1 para salir): ");
            int indice = scanner.nextInt();

            // Verificar si el usuario ha insertado -1 para salir
            if (indice == -1) {
                System.out.println("¡Hasta luego!");
                break;
            }

            // Verificar si el índice está dentro del rango del array
            if (indice >= 0 && indice < abecedario.length) {
                char letraSeleccionada = abecedario[indice];
                System.out.println("Letra seleccionada: " + letraSeleccionada);
            } else {
                System.out.println("Índice no válido. Ingrese un índice válido o -1 para salir.");
            }
        }
    }
}
