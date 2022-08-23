package com.exercises;

import java.util.Scanner;

public class Switch {

    public static void estacion() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese estacion del año:");
        String estacion = scanner.next().toLowerCase();

        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}
