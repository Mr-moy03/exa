package _3_Cola_Circular;

public class ColaCircular {
    private int maximo;
    private int[] datos;
    private int inicio;
    private int fin;

    public ColaCircular(int tamaño) {
        this.maximo = tamaño;
        this.datos = new int[maximo];
        this.inicio = 0;
        this.fin = 0;
    }
    public int nroElem(){
        return (fin - inicio + maximo) % maximo;
    }

    public boolean esVacia() {
        return nroElem() == 0;
    }

    public boolean esLlena() {
        return nroElem() == maximo - 1;
    }

    public void push(int elemento) {
        if (!esLlena()) {
            fin = (fin + 1) % maximo;
            datos[fin] = elemento;
        }
        else {
            System.out.println("Cola circular llena. No se puede encolar.");
        }
    }

    public int pop() {
        int elemento = 0;
        if (!esVacia()) {
            inicio = (inicio + 1) % maximo;
            elemento = datos[inicio];
            return elemento;
        }else {
            System.out.println("Cola circular vacía. No se puede desencolar.");
            return -1;
        }
    }

    public void mostrar() {
        ColaCircular aux = new ColaCircular(maximo);
        while (!esVacia()){
            int elem = pop();
            System.out.print(elem + "-");
            aux.push(elem);
        }
        System.out.println();
        vaciar(aux);
    }

    public void vaciar(ColaCircular c){
        while (!c.esVacia()){
            push(c.pop());
        }
    }
}