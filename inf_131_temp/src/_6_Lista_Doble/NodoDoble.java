package _6_Lista_Doble;

public class NodoDoble {
    private int dato;
    private NodoDoble anterior;
    private NodoDoble siguiente;

    public NodoDoble (int dato){
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }


    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
}
