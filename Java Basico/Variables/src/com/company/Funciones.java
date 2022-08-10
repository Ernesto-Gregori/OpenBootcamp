package com.company;

public class Funciones {

    public static void main(String[] args) {

        holaMundo();

        holaMundo("Alan");

        String hola = devolverHola();
        System.out.println(hola);

    }

    //Private = solo visibles en esta clase
    //public = Se puede invocar en otras clases
    //protected = solo las clases hijas que esten en ese paquete podran acceder
    public static void holaMundo() {
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    private static void holaMundo(String name) {
        System.out.println("Hello " + name);
    }

    private static String devolverHola() {
        return "Hola";
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }
}
