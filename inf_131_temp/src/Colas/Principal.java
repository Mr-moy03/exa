package Colas;

public class Principal{
    public static void main(String[] args) {
        ColaCircular cola = new ColaCircular();

        System.out.println("¿Cola vacía? " + cola.estaVacia());
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.encolar(40);

        System.out.println("\nDespués de encolar 10, 20, 30, 40:");
        cola.imprimirCola();

        int eliminado1 = cola.desencolar();
        System.out.println("\nDesencolado: " + eliminado1);

        System.out.println("Cola después de desencolar uno:");
        cola.imprimirCola(); // [cite: 171]

        cola.encolar(50);
        System.out.println("\nDespués de encolar 50:");
        cola.imprimirCola();


        cola.encolar(60); //

        // Desencolar todos los elementos
        System.out.println("\nDesencolando todos los elementos:");
        while (!cola.estaVacia()) {
            System.out.println("Desencolado: " + cola.desencolar());
        }

        System.out.println("\n¿Cola vacía al final? " + cola.estaVacia());
        cola.imprimirCola();
    }
}