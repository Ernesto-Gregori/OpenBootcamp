package com.exercises;

import java.util.Scanner;

public class IfElse {

    public static void comparar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numeroIf = scanner.nextInt();

        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El numero " + numeroIf + " es neutro");
        } else {
            System.out.println("El numero " + numeroIf + " es negativo");
        }
    }
}
