package com.cristobalbernal.LogicaAlgoritmica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Pedir al usuario que ingrese los números separados por comas
        System.out.println("Introduce varios números separados por comas:");
        String numeros = scanner.nextLine();

        // ponemos las comas en la entrada que ha escrito la persona.
        String[] numeroString = numeros.split(",");

        // Mostrar los numero pares que ha encontrado
        System.out.println("Números pares encontrados:");
        for (int i = 0; i < numeroString.length; i++) {
            // Convertir cada String a un número entero
            int num = Integer.parseInt(numeroString[i].trim());

            // Comprobar si el número es par
            if (num % 2 == 0 ) {
                System.out.println(num);
            }
        }
    }
}
