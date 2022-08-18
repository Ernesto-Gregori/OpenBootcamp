package com.exercises.funcion;

public class Main {
    public static void main(String[] args) {
        FuncionSuma.suma(20, 90, 100);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("La cantidad de puertas es: " + miCoche.numPuertas);

    }
}

