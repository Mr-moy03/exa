package _5_Lista_Simple;

public class LS_simple{
    private Nodo cabeza;

    public Nodo getCabeza(){
        return cabeza;
    }

    public void setCabeza(Nodo c){
        cabeza = c;
    }


    public LS_simple() {
        this.cabeza = null;
    }


    public boolean estaVacia() {
        return cabeza == null;
    }

    public void adiInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
    }

    public void adiFinal(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (estaVacia()) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;

        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        actual.setSiguiente(nuevo);
    }

    public void eliminar(int valor) {
        if (estaVacia()) return;

        if (cabeza.getDato() == valor) {
            cabeza = cabeza.getSiguiente();
            return;
        }
        Nodo actual = cabeza;
        Nodo anterior = null;
        while (actual != null && actual.getDato() != valor) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        if (actual != null) {
            anterior.setSiguiente(actual.getSiguiente());
        }
    }

    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente(); //
        }
        System.out.println("null");
    }

    public int nroNodos() {
        Nodo aux = cabeza;
        int c = 0;
        if(this.estaVacia())
            return 0;
        else {
            while(aux != null) {
                c++;
                aux = aux.getSiguiente();
            }
        }
        return c;
    }

}