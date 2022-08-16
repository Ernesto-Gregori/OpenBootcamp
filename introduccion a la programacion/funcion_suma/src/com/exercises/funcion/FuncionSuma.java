package com.exercises.funcion;

public class FuncionSuma {

    public static void main(String[] args) {

        int number1 = 60;
        int number2 = 40;
        int number3 = 10;
        int result = suma(number1, number2, number3);
        System.out.println(result);
    }

    static int suma(int number1, int number2, int number3) {
        return (number1 + number2 + number3);
    }

}
