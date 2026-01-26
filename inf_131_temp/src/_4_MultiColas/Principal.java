package _4_MultiColas;

public class Principal {
    public static void main(String[] args) {
        // Arreglo de tamaño 12 con 3 colas (cada cola tiene segmento de 4 posiciones) [cite: 215-217]
        MultiCola multiCola = new MultiCola(12, 3);

        // Encolar en distintas colas [cite: 219-236]
        System.out.println("Encolando en cola 0...");
        multiCola.encolar(10, 0);
        multiCola.encolar(20, 0);
        multiCola.encolar(30, 0);

        System.out.println("Encolando en cola 1...");
        multiCola.encolar(100, 1);
        multiCola.encolar(200, 1);

        System.out.println("Encolando en cola 2...");
        multiCola.encolar(1000, 2);
        multiCola.encolar(2000, 2);
        multiCola.encolar(3000, 2);

        // Mostrar estado inicial [cite: 238-241]
        System.out.println("\nEstado inicial de las colas:");
        multiCola.imprimirCola(0);
        multiCola.imprimirCola(1);
        multiCola.imprimirCola(2);

        // Desencolar de algunas colas [cite: 243-247]
        System.out.println("\nDesencolando desde cola 0 y 2...");
        int v1 = multiCola.desencolar(0);
        int v2 = multiCola.desencolar(2);
        System.out.println("Elemento desencolado de cola 0: " + v1);
        System.out.println("Elemento desencolado de cola 2: " + v2);

        // Mostrar estado después de desencolar [cite: 253-256]
        System.out.println("\nEstado de las colas después de desencolar:");
        multiCola.imprimirCola(0);
        multiCola.imprimirCola(1);
        multiCola.imprimirCola(2);

        // Vaciar completamente la cola 1 [cite: 258-262]
        System.out.println("\nVaciando completamente cola 1:");
        while (!multiCola.estaVacia(1)) {
            System.out.println("Desencolado de cola 1: " + multiCola.desencolar(1));
        }

        // Intento extra para ver el underflow [cite: 263]
        multiCola.desencolar(1);
    }
}