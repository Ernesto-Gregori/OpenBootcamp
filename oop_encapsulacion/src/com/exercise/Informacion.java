package com.exercise;

public class Informacion {

    public static void main(String[] args) {

        Persona joven = new Persona();

        joven.setEdad(26);
        joven.setNombre("Oscar Gregori");
        joven.setTelefono(95648726);

        int edad = joven.getEdad();
        String nombre = joven.getNombre();
        int telefono = joven.getTelefono();

        System.out.println("El nombre de la persona es: " + nombre + " tiene " + edad + " años, su numero de telefono es: " + telefono);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}