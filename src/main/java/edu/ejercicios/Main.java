package edu.ejercicios;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // Crear un array para almacenar los números del 1 al 100
        int[] numeros = new int[100];

        // Llenar el array con los números del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Mostrar los números por pantalla
        System.out.println("Números del 1 al 100:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Calcular la suma de los números
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        // Calcular la media de los números
        double media = (double) suma / numeros.length;

        // Mostrar la suma y la media por pantalla
        System.out.println("\nSuma de los números: " + suma);
        System.out.println("Media de los números: " + media);
    }
}


