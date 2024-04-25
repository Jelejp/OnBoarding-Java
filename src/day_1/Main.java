package day_1;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        //1.
        String lName = "Jelena";
        String fName = "Palavecino";
        byte age = 19;
        System.out.println(lName);
        System.out.println(fName);
        System.out.println(age);
        messageWelcome();
        numMayor();
        parOInpar();
        igualDistinto();
        checkearNumPrimo();
        int[] numeros = {10, 11, 12, 13, 14, 15};
        int sumaImpares = sumaImpares(numeros);
        System.out.println("La suma de los números impares es : " + sumaImpares);
        int paresYPrimos = paresYPrimos(numeros);
        System.out.println(paresYPrimos);
        calculadora();
        bowling();


    }

    public static void messageWelcome() {
        System.out.println("¡Welcome!");
    }

    //3.
    public static void numMayor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int number1 = scanner.nextInt();
        System.out.println("Introduce el segundo número");
        int number2 = scanner.nextInt();
        System.out.println("Introduce el tercer número");
        int number3 = scanner.nextInt();
        int numberMayor = number1;
        if (number2 > numberMayor) {
            numberMayor = number2;
        } else if (number3 > numberMayor) {
            numberMayor = number3;
        }
        System.out.println("El número mayor es : " + numberMayor);
    }

    //4.
    public static void parOInpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intruduce un número");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido es impar");
        }
    }

    //5.
    public static void igualDistinto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numIgualDistinto = scanner.nextInt();
        System.out.println("Introduce otro número");
        int num2IgualDistinto = scanner.nextInt();
        if (numIgualDistinto == num2IgualDistinto) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números son distintos");
        }
    }

    //6.
    public static void checkearNumPrimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int number = scanner.nextInt();
        boolean esPrimo = true; // Suponemos que el número es primo hasta que se demuestre lo contrario

        if (number <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    esPrimo = false;
                    break; // Si encontramos un divisor, salimos del bucle porque el número no es primo
                }
            }
        }
        if (esPrimo) {
            System.out.println(number + " es un número primo.");
        } else {
            System.out.println(number + " no es un número primo.");
        }
    }

    //7.
    public static int sumaImpares(int[] array) {
        int suma = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                suma += num;
            }
        }
        return suma;
    }

    //8.
    public static int paresYPrimos(int[] array) {
        int sumaPares = 0;
        int sumaPrimos = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                sumaPares += num;
            }

            boolean esPrimo = true; // Suponemos que el número es primo hasta que se demuestre lo contrario
            if (num <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break; // Si encontramos un divisor, salimos del bucle porque el número no es primo
                    }
                }
            }

            if (esPrimo) {
                sumaPrimos += num;
            }
        }

        System.out.println("La suma de los numeros pares es : " + sumaPares);
        System.out.println("La suma de los numeros primos es : " + sumaPrimos);

        return sumaPrimos;
    }


    //9 y 10.
    public static void calculadora() {
        Scanner scanner = new Scanner(System.in);
        {
            int opcion;

            do {
                System.out.println("==== MENÚ DE LA CALCULADORA ====");
                System.out.println("Elija una opción:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("0. Salir");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el primer número");
                        int num1Suma = scanner.nextInt();
                        System.out.println("Ingrese el segundo número");
                        int num2Suma = scanner.nextInt();
                        int sumaNum = num1Suma + num2Suma;
                        System.out.println("La suma de los números es : " + sumaNum);
                        break;
                    case 2:
                        System.out.println("Ingrese el primer número");
                        int num1Resta = scanner.nextInt();
                        System.out.println("Ingrese el segundo número");
                        int num2Resta = scanner.nextInt();
                        int restaNum = num1Resta - num2Resta;
                        System.out.println("La resta de los números es : " + restaNum);
                        break;
                    case 3:
                        System.out.println("Ingrese el primer número");
                        int num1Multiplic = scanner.nextInt();
                        System.out.println("Ingrese el segundo número");
                        int num2Multiplic = scanner.nextInt();
                        int multiplicacionNum = num1Multiplic * num2Multiplic;
                        System.out.println("La multiplicación de los números es : " + multiplicacionNum);
                        break;
                    case 4:
                        System.out.println("Ingrese el primer número");
                        int num1Division = scanner.nextInt();
                        System.out.println("Ingrese el segundo número");
                        int num2Division = scanner.nextInt();
                        if (num2Division != 0) {
                            int divisionNum = num1Division / num2Division;
                            System.out.println("La división de los números es : " + divisionNum);
                        } else {
                            System.out.println("No se puede dividir por 0");
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo de la calculadora..");
                        break;
                    default:
                        System.out.println("Ingrese una opción valida");
                        break;
                }
            } while (opcion != 0);
        }
    }
    //11 y 12.
    public static void bowling() {
        Scanner scanner = new Scanner(System.in);
        int capacidad = 500;
        double dineroRecaudado = 0;
        int precioEntradaNormal = 1500;
        int opcion;

        do {
            System.out.println("MENU BOWLING");
            System.out.println("1. Entrada de datos");
            System.out.println("2. Capacidad disponible");
            System.out.println("3. Dinero recaudado");
            System.out.println("0. Salir");
            System.out.print("Choose an option: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ENTRADA DE DATOS:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("DNI: ");
                    String dni = scanner.next();
                    System.out.print("¿Tiene pase VIP? (si/no): ");
                    String tienePaseVip = scanner.next();

                    if (edad < 21) {
                        System.out.println("Sorry, you must be at least 21 years old to enter the Bowling Alley. Goodbye!");
                        return;
                    }
                    System.out.println("Bienvenido, " + nombre + "!");

                    double precioEntrada;
                    if (tienePaseVip.equalsIgnoreCase("si")) {
                        precioEntrada = 0;
                    } else {
                        System.out.println("Tienes pase con descuento (si/no)");
                        String paseDescuento = scanner.next();
                        if (paseDescuento.equalsIgnoreCase("si")) {
                            precioEntrada = precioEntradaNormal / 2;
                        } else {
                            System.out.println("¿Que tipo de entrada deseas comprar?:");
                            System.out.println("1. Entrada normal ($1500)");
                            System.out.println("2. Pase VIP ($2000)");
                            int tipoDeEntrada = scanner.nextInt();
                            precioEntrada = (tipoDeEntrada == 1) ? 1500 : 2000;
                        }
                    }
                    if (precioEntrada > 0) {
                        System.out.println("El precio de su entrada es: $" + precioEntrada);
                        System.out.println("Gracias por su compra, que se divierta!");
                        dineroRecaudado += precioEntrada;
                        capacidad--;
                    } else {

                        System.out.println("Bienvenido! Entra gratis con su pase VIP, que se divierta.");
                        capacidad--;
                    }

                    break;
                case 2:
                    System.out.println("Capacidad disponible: " + capacidad);
                    break;
                case 3:
                    System.out.println("Dinero recaudado: $" + dineroRecaudado);
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija de nuevo.");
                    break;
            }

        } while(opcion !=0);
    }
}
