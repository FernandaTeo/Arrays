package edu.ejercicios;

import java.util.Random;

public class ejer4 {
    public static void main(String[] args) {
        // Crear un array con números aleatorios entre 0 y 10
        int[] numeros = new int[10]; // Puedes ajustar la longitud según tus necesidades

        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(11); // Genera números aleatorios entre 0 (inclusive) y 11 (exclusive)
        }

        // Mostrar los números por pantalla
        System.out.println("Números aleatorios entre 0 y 10:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

