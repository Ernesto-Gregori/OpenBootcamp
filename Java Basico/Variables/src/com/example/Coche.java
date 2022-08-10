package com.example;

public class Coche {

    //Atributos, caracteristicas que puede tener y varia
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //Constructores, construir objetos a partir de la clase
    public Coche() {

    }
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }
    //Comportamiento, diferentes metodos que simbolicen el comportamineto
    public void acelerar(Integer cantidad){

        if(cantidad > 0 && cantidad <= 120){
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", largo='" + largo + '\'' +
                '}';
    }
}
