package _7_Recursividad;

import java.util.Scanner;

public class Recursivo2 {
    public static long producto(int a, int b) {
        System.out.println("LLAMADA PARA a = " + a + " b = " + b);
        if (b == 1) {
            System.out.println("CASO BASE: devuelve " + a);
            return a;
        } else {
            long sub = producto(a, b - 1);
            long res = sub + a;

            System.out.println("DEVUELVE a * b = " + sub + " + " + a + " = " + res);
            return res; // [cite: 400]
        }
    }

    public static void main(String[] args) {
        System.out.println("PROGRAMA RECURSIVO HALLA EL PRODUCTO DE DOS NUMEROS");
        System.out.println("\t-----");

        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        do {
            System.out.print("Ingrese un valor para a: ");
            a = sc.nextInt();
        } while (a <= 0);

        do {
            System.out.print("Ingrese un valor para b: ");
            b = sc.nextInt();
        } while (b <= 0);

        long prod = producto(a, b);
        System.out.println("El producto es: " + prod);

        sc.close();
    }
}
