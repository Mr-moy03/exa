package Listas;

public class main {
    public static void main(String[] args){
        System.out.println("sumatoria:");
        System.out.println(sumatoria(10));

        System.out.println("Potencia:");
        System.out.println(potencia(2,10));

        System.out.println("suma de los n primeros pares:");
        System.out.println(sumaPar(10));

        System.out.println("Fibonacci:");
        System.out.println(fibonacci(6));

        System.out.println("sumar digitos de n");
        System.out.println(sumaDig(1384));

        System.out.println("contar los digitos de n");
        System.out.println(contarDig(1384));

        System.out.println("mostrar los n primeros numeros");
        mostrar(10);
    }
    public static int sumatoria(int n){
        if(n > 0){
            return ( n + sumatoria(n - 1));
        }
        else{
            return 0;
        }
    }
    public static int potencia(int a, int b){
        if(b == 0){
            return 1;

        }
        else{
            return (a * potencia(a,b - 1));
        }
    }
    public static int sumaPar(int n){
        if(n == 0){
            return 1;
        }
        else
            return (n * 2 + sumaPar(n - 1));
    }
    public static int fibonacci(int n){
        if (n == 1){
            return 0;
        } else{
            if(n == 2){
                return 1;
            } else{
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }
    public static void mostrar(int n){
        if (n != 0){
            mostrar(n-1);
            System.out.print(n+",");
        }
    }
    public static int sumaDig(int n){
        if (n == 0){
            return 0;
        }
        else {
            return (sumaDig(n/10) + (n % 10));
        }
    }
    public static int contarDig(int n){
        if (n == 0){
            return 0;
        }
        else {
            return (contarDig(n/10) + 1);
        }
    }
}