package com.company;

public class While {

    public static void main(String[] args) {

        int count = 0;

        while(count < 10) {

            count++; //Condicion

            if(count == 6)
                break; //Romper el flujo
                //continue; //Salta el valor y continua la siguiente iteracion

            System.out.println(count + " Hello world");

        }

        System.out.println("fin");
    }
}
