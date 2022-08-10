package com.company;

public class Switch {

    public static void main(String[] args) {
        String weather = "4494";

        switch(weather) {

            case "sunny":
                System.out.println("El tiempo soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            default:
                System.out.println("No se ha podido identificar el clima");
        }
    }
}
