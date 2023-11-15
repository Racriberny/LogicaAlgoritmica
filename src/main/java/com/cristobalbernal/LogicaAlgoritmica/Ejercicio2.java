package com.cristobalbernal.LogicaAlgoritmica;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        //Numero introducido
        int numeroIntroduccido = 0;
        //Cantidad de numeros
        int cantidadNumeros = 0;
        //Nota que introduce la persona
        int nota;
        //hacemos un while el cual cuando introduzcan -1 pare.
        while (true){
            //pedimos al usuario introducir notas hasta que pongas -1
            System.out.println("Escribe numeros hasta que introduzcas -1");
            nota = Integer.parseInt(lector.nextLine());
            //Si no es -1 se para el programa
            if (nota == -1){
                break;
            }
            //Aqui sumamos la nota al numero introducido
            numeroIntroduccido+=nota;
            //Sumamos un cuando se ha introducido una nota
            cantidadNumeros++;
        }
        //Comprobamos que numero introducido sea mayor de 0 y si es asi mostrmos los la mitjana de la nota y sino es menos de 0
        //hacemos que salte no has introduccido ninguna nota!!!
        if (numeroIntroduccido > 0){
            double calculo = (float) numeroIntroduccido/cantidadNumeros;
            System.out.println("Esta es la mitjana de las notas " + calculo);
        }else {
            System.out.println("No has introduccido ninguna nota");
        }
    }
}
