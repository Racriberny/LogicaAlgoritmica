package com.cristobalbernal.LogicaAlgoritmica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        //Creamos un array de numero de cantidad de 8
        int[] numeros = new int[8];
        //Creamos dos arraylist uno de numeros pares y otro de impares
        //Lo he hecho con arraylist porque asi puede crecer lo que quiera el array.
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        //Solicitamos al usuario los numeros
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Escribe el numero " + i);
            numeros[i] =  Integer.parseInt(lector.nextLine());
        }
        //Hacemos un for el cual recorre el array de numeros y si es par te lo guarda en el arraylis de pares y
        // si no es par sera impar
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }else {
                numerosImpares.add(numero);
            }
        }
        //Mostramos los numeros.
        System.out.println("Numeros pares " +numerosPares);
        System.out.println("Numeros impares " +numerosImpares);
    }
}
