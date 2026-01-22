package Colas;

public class ColaCircular {
    // 1. Atributos
    private final int CAPACIDAD = 5; // Constante que define el tamaño máximo
    private int[] datos;             // Arreglo que almacena los elementos
    private int inicio;              // Índice del frente (HEAD)
    private int fin;                 // Índice de inserción (TAIL)
    private int numElementos;        // Contador para control preciso de estado

    // 2. Constructor
    public ColaCircular() {
        datos = new int[CAPACIDAD];
        inicio = 0;
        fin = 0;
        numElementos = 0; // La cola empieza vacía
    }

    // 3. Método para verificar si está vacía
    public boolean estaVacia() {
        return numElementos == 0; // Retorna true si no hay elementos
    }

    // 4. Método para verificar si está llena
    public boolean estaLlena() {
        return numElementos == CAPACIDAD; // Retorna true si alcanzó la capacidad máxima
    }

    // 5. Método Encolar (Insertar)
    public void encolar(int elemento) {
        if (estaLlena()) {
            System.out.println("Cola circular llena. No se puede encolar."); //
            return;
        }

        datos[fin] = elemento; // Almacena el elemento
        fin = (fin + 1) % CAPACIDAD; // Movimiento circular del índice fin
        numElementos++; // Incrementa el contador
    }

    // 6. Método Desencolar (Eliminar)
    public int desencolar() {
        if (estaVacia()) {
            System.out.println("Cola circular vacía. No se puede desencolar."); //
            return -1; // Valor de error
        }

        int aux = datos[inicio]; // Guarda el elemento del frente
        inicio = (inicio + 1) % CAPACIDAD; // Movimiento circular del índice inicio
        numElementos--; // Decrementa el contador
        return aux; // Retorna el valor eliminado
    }

    // 7. Método Imprimir Cola
    public void imprimirCola() {
        if (estaVacia()) {
            System.out.println("Cola circular vacía."); //
            return;
        }

        System.out.println("Contenido de la cola circular:");
        int indice = inicio; // Variable temporal para recorrer sin modificar 'inicio'

        // Recorre solo la cantidad de elementos existentes válidos
        for (int i = 0; i < numElementos; i++) {
            System.out.println("\t" + datos[indice]); // Imprime el dato
            indice = (indice + 1) % CAPACIDAD; // Avanza circularmente
        }
    }
}