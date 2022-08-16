package com.exercises.funcion.funcioncohe;
//Crear clase Coche
public class Coche {
    public static void main(String[] args) {

        int puertaCoche = 3;
        numPuertas(puertaCoche);

        class miCoche {
            static int puerta = 1;
        }

        System.out.println("El numero de puertas que tiene el objeto miCoche es: " + miCoche.puerta);
    }

    static void numPuertas(int puertaCoche) {
        for (int i = 0; i < puertaCoche; i++) {
            System.out.println("Incrementando el numero de puertas a: " + i);
        }
    }
}
