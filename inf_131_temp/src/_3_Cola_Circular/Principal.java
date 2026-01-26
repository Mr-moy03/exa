package _3_Cola_Circular;

public class Principal{
    public static void main(String[] args) {
        ColaCircular cola = new ColaCircular(50);

        System.out.println("¿Cola vacía? " + cola.esVacia());
        cola.push(10);
        cola.push(20);
        cola.push(30);
        cola.push(40);

        System.out.println("\nDespués de encolar 10, 20, 30, 40:");
        cola.mostrar();

        int eliminado1 = cola.pop();
        System.out.println("\nDesencolado: " + eliminado1);

        System.out.println("Cola después de desencolar uno:");
        cola.mostrar(); // [cite: 171]

        cola.push(50);
        System.out.println("\nDespués de encolar 50:");
        cola.mostrar();


        cola.push(60); //

        // Desencolar todos los elementos
        System.out.println("\nDesencolando todos los elementos:");
        while (!cola.esVacia()) {
            System.out.println("Desencolado: " + cola.pop());
        }

        System.out.println("\n¿Cola vacía al final? " + cola.esVacia());
        cola.mostrar();
    }
}