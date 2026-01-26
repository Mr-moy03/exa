package _7_Recursividad;

public class RecursividadFactorial {
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        long resultado = factorial(numero);

        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}