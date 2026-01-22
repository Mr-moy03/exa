package MultiColas;

public class MultiCola {
    private int[] arr;
    private int n;
    private int k;
    private int[] frente;
    private int[] fin;
    private int segSize;

    public MultiCola(int n, int k) {
        this.n = n;
        this.k = k;
        this.arr = new int[n];
        this.frente = new int[k];
        this.fin = new int[k];
        this.segSize = n / k;

        for (int i = 0; i < k; i++) {
            frente[i] = -1;
            fin[i] = -1;
        }
    }

    public boolean estaVacia(int q) {
        return frente[q] == -1;
    }

    public boolean estaLlena(int q) {
        if (fin[q] == -1) {
            return false;
        } else {
            int base = q * segSize;
            int nextPos = base + ((fin[q] + 1 - base) % segSize);

            return nextPos == frente[q];
        }
    }

    public boolean encolar(int x, int q) {
        if (q < 0 || q >= k) {
            System.out.println("Número de cola inválido: " + q);
            return false;
        }

        if (estaLlena(q)) {
            System.out.println("Overflow en cola " + q + ". No se puede encolar.");
            return false;
        }

        int base = q * segSize;

        if (estaVacia(q)) {
            frente[q] = base;
            fin[q] = base;
        } else {
            fin[q] = base + ((fin[q] + 1 - base) % segSize);
        }

        arr[fin[q]] = x;
        return true;
    }

    public int desencolar(int q) {
        if (q < 0 || q >= k) {
            System.out.println("Número de cola inválido: " + q);
            return -1;
        }

        if (estaVacia(q)) {
            System.out.println("Underflow en cola " + q + ". No se puede desencolar.");
            return -1;
        }

        int base = q * segSize;
        int valor = arr[frente[q]];

        if (frente[q] == fin[q]) {
            frente[q] = -1;
            fin[q] = -1;
        } else {
            frente[q] = base + ((frente[q] + 1 - base) % segSize);
        }

        return valor;
    }

    public void imprimirCola(int q) {
        if (q < 0 || q >= k) {
            System.out.println("Número de cola inválido: " + q);
            return;
        }

        if (estaVacia(q)) {
            System.out.println("Cola " + q + " vacía.");
            return;
        }

        System.out.println("Contenido de la cola " + q + ":");
        int base = q * segSize;
        int idx = frente[q];

        while (true) {
            System.out.println("\t" + arr[idx]);
            if (idx == fin[q]) break;
            idx = base + ((idx + 1 - base) % segSize);
        }
    }
}