package es.daw.calculadora;

import java.util.Scanner;

public class Calculadora {
    private static final int DEFAULT_VALUE = 0;
    private static final int OPCION_SUMAR = 1;
    private static final int OPCION_RESTAR = 2;
    private static final int OPCION_MULTIPLICAR = 3;
    private static final int OPCION_DIVIDIR = 4;
    private static final int OPCION_POTENCIA = 5;
    private static final int OPCION_RAIZ = 6;
    private static final int OPCION_SENO = 7;
    private static final int OPCION_COSENO = 8;
    private static final int OPCION_CELSIUS_A_FAHRENHEIT = 9;
    private static final int OPCION_FAHRENHEIT_A_CELSIUS = 10;
    private static final int OPCION_KM_A_MILLAS = 11;
    private static final int OPCION_MILLAS_A_KM = 12;
    private static final int OPCION_KG_A_LIBRAS = 13;
    private static final int OPCION_LIBRAS_A_KG = 14;
    private static final int OPCION_SALIR = 15;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = DEFAULT_VALUE;
        double primero = DEFAULT_VALUE;
        double segundo = DEFAULT_VALUE;
        double resultado = DEFAULT_VALUE;
        String nombreOpcion[] = { "Sumar", "Restar", "Multiplicar", "Dividir", "Potencia", "Raiz cuadrada",
                "Seno (grados)", "Coseno (grados)", "Celsius a Fahrenheit", "Fahrenheit a Celsius",
                "Kilometros a millas", "Millas a kilometros", "Kilogramos a libras", "Libras a kilogramos", "Salir" };

        do {

            System.out.println();
            System.out.println("======================================");
            System.out.println("       CALCULADORA SUPER TOTAL");
            System.out.println("======================================");

            for (int i = 0; i < nombreOpcion.length; i++) {
                System.out.println((i + 1) + ". " + nombreOpcion[i]);
            }

            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case OPCION_SUMAR, OPCION_RESTAR, OPCION_MULTIPLICAR, OPCION_DIVIDIR, OPCION_POTENCIA -> {
                    System.out.print("Escribe el primer numero: ");
                    primero = teclado.nextDouble();
                    System.out.print("Escribe el segundo numero: ");
                    segundo = teclado.nextDouble();
                    resultado = calcular(opcion, primero, segundo);
                    System.out.println("El resultado final es: " + resultado);
                }
                case OPCION_RAIZ, OPCION_SENO, OPCION_COSENO,
                        OPCION_CELSIUS_A_FAHRENHEIT, OPCION_FAHRENHEIT_A_CELSIUS,
                        OPCION_KM_A_MILLAS, OPCION_MILLAS_A_KM,
                        OPCION_KG_A_LIBRAS, OPCION_LIBRAS_A_KG -> {
                    System.out.print("Escribe el valor: ");
                    primero = teclado.nextDouble();
                    segundo = DEFAULT_VALUE;
                    resultado = calcular(opcion, primero, segundo);
                    if (opcion == OPCION_RAIZ) {
                        System.out.println("La raiz es: " + resultado);
                    }
                    if (opcion == OPCION_SENO) {
                        System.out.println("El seno de " + primero + " grados es " + resultado);
                    }
                    if (opcion == OPCION_COSENO) {
                        System.out.println("El coseno de " + primero + " grados es " + resultado);
                    }
                    if (opcion == OPCION_CELSIUS_A_FAHRENHEIT) {
                        System.out.println(primero + " Celsius son " + resultado + " Fahrenheit");
                    }
                    if (opcion == OPCION_FAHRENHEIT_A_CELSIUS) {
                        System.out.println(primero + " Fahrenheit son " + resultado + " Celsius");
                    }
                    if (opcion == OPCION_KM_A_MILLAS) {
                        System.out.println(primero + " kilometros son " + resultado + " millas");
                    }
                    if (opcion == OPCION_MILLAS_A_KM) {
                        System.out.println(primero + " millas son " + resultado + " kilometros");
                    }
                    if (opcion == OPCION_KG_A_LIBRAS) {
                        System.out.println(primero + " kilogramos son " + resultado + " libras");
                    }
                    if (opcion == OPCION_LIBRAS_A_KG) {
                        System.out.println(primero + " libras son " + resultado + " kilogramos");
                    }
                }
                case OPCION_SALIR -> System.out.println("Gracias por usar la calculadora");
                default -> System.out.println("Opcion no valida. Prueba otra vez.");
            }
        } while (opcion != OPCION_SALIR);

        teclado.close();
    }

    public static double calcular(int opcion, double primero, double segundo) {
        double resultado = DEFAULT_VALUE;

        if (opcion == OPCION_SUMAR) {
            resultado = primero + segundo;
        } else if (opcion == OPCION_RESTAR) {
            resultado = primero - segundo;
        } else if (opcion == OPCION_MULTIPLICAR) {
            resultado = primero * segundo;
        } else if (opcion == OPCION_DIVIDIR) {
            if (segundo == 0) {
                resultado = DEFAULT_VALUE;
            } else {
                resultado = primero / segundo;
            }
        } else if (opcion == OPCION_POTENCIA) {
            resultado = Math.pow(primero, segundo);
        } else if (opcion == OPCION_RAIZ) {
            if (primero < 0) {
                resultado = Math.sqrt(primero * -1);
            } else {
                resultado = Math.sqrt(primero);
            }
        } else if (opcion == OPCION_SENO) {
            resultado = Math.sin(primero);
        } else if (opcion == OPCION_COSENO) {
            resultado = Math.cos(primero * 3.14 / 180);
        } else if (opcion == OPCION_FAHRENHEIT_A_CELSIUS) {
            resultado = primero - 32 / 1.8;
        } else if (opcion == OPCION_CELSIUS_A_FAHRENHEIT) {
            resultado = primero * 1.8 + 32;
        } else if (opcion == OPCION_MILLAS_A_KM) {
            resultado = primero * 1.60934;
        } else if (opcion == OPCION_KM_A_MILLAS) {
            resultado = primero / 1.60934;
        } else if (opcion == OPCION_KG_A_LIBRAS) {
            resultado = primero * 2.2;
        } else if (opcion == OPCION_LIBRAS_A_KG) {
            resultado = primero / 2.2;
        }

        return resultado;
    }
}