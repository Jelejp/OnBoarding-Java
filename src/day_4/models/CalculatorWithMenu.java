package day_4.models;

import day_4.CalculatorMenu;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu {
    //ATRIBUTOS
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);

//METODOS DE LA INTERFAZ CALCULATORMENU
    @Override
    public void menuCalculadora() {
        System.out.println(generarOpciones());
    }

    @Override
    public void ejecutarOperacion() {
        opciones();
    }
//METODOS
    private String generarOpciones(){
        return """
                "==== MENÚ DE LA CALCULADORA ===="
                "Elija una opción:";
                "1. Sumar";
                "2. Restar";
                "3. Multiplicar";
                "4. Dividir";
                "0. Salir"
                """;
    }

    private void opciones (){
        int opcion;
        do{
            menuCalculadora();
            System.out.println("Ingrese su elección");
            opcion = scanner.nextInt();
            int num1 , num2;
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el primer número");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número");
                    num2 = scanner.nextInt();
                    System.out.println("La suma de los números es : " + calculator.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Ingrese el primer número");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número");
                    num2 = scanner.nextInt();
                    System.out.println("La resta de los números es : " + calculator.restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Ingrese el primer número");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número");
                    num2 = scanner.nextInt();
                    System.out.println("La multiplicación de los números es : " + calculator.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Ingrese el primer número");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        System.out.println("La división de los números es : " + calculator.dividir(num1, num2));
                    } else {
                        System.out.println("No se puede dividir por 0");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }

        }while (opcion != 0);

    }
}
