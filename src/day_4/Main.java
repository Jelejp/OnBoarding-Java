package day_4;

import day_4.models.CalculatorWithMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        CalculatorMenu calculatorMenu = new CalculatorWithMenu();
        boolean ejecutarMenu = true;
        while (ejecutarMenu){
            calculatorMenu.ejecutarOperacion();

            System.out.println("¿Desea salir? (0. SI / 1. NO ");
            int opcion = scanner.nextInt();
            ejecutarMenu = (opcion == 1);
        }

    }
}
