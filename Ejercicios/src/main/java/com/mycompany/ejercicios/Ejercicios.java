package com.mycompany.ejercicios;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Ejercicios.ejercicio19();

    }

    public static void ejercicio1() {
        Scanner read = new Scanner(System.in);

        int num1, num2;

        System.out.println("Ingrese el primer numero");
        num1 = read.nextInt();
        System.out.println("Ingrese el segundo numero numero");
        num2 = read.nextInt();

        System.out.println("La suma de los numeros es: " + num1 + num2);
    }

    public static void ejercicio2() {

        Scanner read = new Scanner(System.in);

        String nombre;

        System.out.println("Ingrese su nombre");
        nombre = read.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
    }

    public static void ejercicio3() {

        Scanner read = new Scanner(System.in);

        System.out.println("Ingresa una frase ");
        String frase = read.nextLine();
        System.out.println("La frase ingresada en Mayus: " + frase.toLowerCase());
        System.out.println("La frase ingresada en Mayus: " + frase.toUpperCase());
    }

    public static void ejercicio4() {

        Scanner read = new Scanner(System.in);

        double far, cen;

        System.out.println("Ingresa los grados Centigrados a convertir ");
        cen = read.nextDouble();

        far = 32 + (9 * cen / 5);

        System.out.println("Los grados " + cen + " son " + far + "grados farharengeit");

    }

    public static void ejercicio5() {

        Scanner read = new Scanner(System.in);

        int num;

        System.out.println("Ingrese un numero");
        num = read.nextInt();

        System.out.println("El doble del numero ingresado es: " + num * 2);
        System.out.println("El triple del numero ingresaod es: " + num * 3);
        System.out.println("La raiz cuadrada del nuemero es: " + sqrt(num));

    }

    public static void ejercicio10() {

        Scanner read = new Scanner(System.in);

        int numLimite, num;
        int suma = 0;

        System.out.println("Ingrese un numero limite para la suma de numeros");
        numLimite = read.nextInt();

        do {
            System.out.print("Ingerse el numero que desee sumar");
            num = read.nextInt();
            suma = num + suma;

        } while (suma < numLimite);

        if (suma > numLimite) {
            System.out.println("La suma de los numero es " + suma);
        }

    }

    public static void ejercicio18() {

        {

            Scanner read = new Scanner(System.in);
            int x;

            System.out.print("Ingrese el tamanio de las Filas: ");
            x = read.nextInt();
            System.out.println("--------------------------------------");

            int matriz[][] = new int[x][x];
            int matrizTrans[][] = new int[x][x];

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {

                    matriz[i][j] = (int) (Math.random() * 10);
                }
            }
            System.out.println("Matriz original es: ");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    System.out.print("[" + matriz[i][j] + "]" + " ");
                }
                System.out.println("");
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    matrizTrans[j][i] = matriz[i][j];
                }
            }

            System.out.println("La matriz traspuesta es: ");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    System.out.print("[" + matrizTrans[i][j] + "]" + " ");
                }
                System.out.println("");
            }
        }
    }

    public static void ejercicio19() {

        Scanner read = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int matrizTrans[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresa el valor para la posicion " + i+","+j+" : ");
                matriz[i][j] = read.nextInt();
            }
        }
        System.out.println("Matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTrans[j][i] = matriz[i][j]*-1;
            }
        }
        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizTrans[i][j] + "]" + " ");
            }
            System.out.println("");
        }

        System.out.println("---------------------------------------------------------------------");

    }

}
