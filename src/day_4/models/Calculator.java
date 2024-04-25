package day_4.models;

import day_4.CalculatorOperations;

public class Calculator implements CalculatorOperations {

    @Override
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
