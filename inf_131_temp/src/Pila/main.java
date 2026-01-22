package Pila;

public class main {
    public static void main(String[] args) {

        Pila pila = new Pila(5);

        System.out.println("¿La pila esta vacia? " + pila.esVacia());

        System.out.println("\nApilando elementos 10, 20, 30...");
        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("\nContenido de la pila:");
        pila.mostrar();

        System.out.println("\nDesapilando un elemento...");
        int eliminado = pila.pop();
        System.out.println("Elemento desapilado: " + eliminado);

        System.out.println("\nContenido de la pila después de desapilar:");
        pila.mostrar();

        System.out.println("\nApilando más elementos 40, 50, 60...");
        pila.push(40);
        pila.push(50);
        pila.push(60);

        System.out.println("\n¿La pila está llena? " + pila.esLlena());

        System.out.println("\nDesapilando todos los elementos:");
        while (!pila.esVacia()) {
            System.out.println("Desapilado: " + pila.pop());
        }

        System.out.println("\nIntentando desapilar de una pila vacía:");
        pila.pop();

        System.out.println("\nImprimir pila vacía:");
        pila.mostrar();
    }
}

