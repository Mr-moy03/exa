package _7_Recursividad;
import java.util.Scanner;

public class Recursivo3 {
    public static int fibonacci(int a) {
        if (a <= 1){
            return a;
        }else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("N: ");
            n = sc.nextInt();
        } while (n < 0);

        System.out.println("La serie es:");
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i));
            cont += fibonacci(i);
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println(cont);

        sc.close();
    }
}