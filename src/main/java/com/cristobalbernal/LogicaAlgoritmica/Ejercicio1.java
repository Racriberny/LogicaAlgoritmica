package com.cristobalbernal.LogicaAlgoritmica;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    //public static Scanner lector = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        // Creas el array de enteros directamente
        int[] numeros = new int[8];

        // Aquí es donde se generan los 8 números pseudoaleatorios.
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        // Muestras los números desordenados
        System.out.println("Lista de numeros desordenada " + Arrays.toString(numeros));

        // Llamas a la función de ordenación
        int[] numerosOrdenados = ordenacionBurbuja(numeros);

        // Muestras la lista de números ordenada
        System.out.println("Lista de numeros ordenados: " + Arrays.toString(numerosOrdenados));
    }

    /**
     * Este metodo es el que te hace la ordenacion en Burbuja
     * @param numeros le pasas el array de numeros
     * @return devuelve el array ordenado.
     */
    public static int[] ordenacionBurbuja(int[] numeros) {
        int aux;
        //recoremos la lista que le hemos pasado por el metodo.
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                //Aqui hacemos la comprobacion si es elemento es mayor y si es mayor se substituye y
                // sino es mayor no se substituye.
                if (numeros[j + 1] < numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        //devolvemos la lista ordenada.
        return numeros;
    }
}
