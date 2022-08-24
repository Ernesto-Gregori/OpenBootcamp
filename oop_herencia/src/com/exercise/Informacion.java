package com.exercise;

public class Informacion {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.edad = 26;
        cliente.nombre = "Juan Jose";
        cliente.telefono = 25623486;
        cliente.credito = 200.50;

        int edad = cliente.edad;
        String nombre = cliente.nombre;
        int telefono = cliente.telefono;
        double credito = cliente.credito;

        System.out.println("El cliente: " + nombre + " de " + edad + " años, tiene un credito aprobado de $" + credito + " llamar al numero " + telefono);
    }
}

class Persona {

    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {

    double salario;
}
