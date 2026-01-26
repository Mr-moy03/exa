package _6_Lista_Doble;

public class ListaDoble {
    private NodoDoble cabeza;
    private NodoDoble cola;


    public ListaDoble(){
        this.cabeza = null;
        this.cola = null;
    }

    public NodoDoble getCabeza(){
        return cabeza;
    }
    public void setCabeza(NodoDoble c){
        cabeza = c;
    }

    public NodoDoble getCola(){
        return cola;
    }
    public void setCola(NodoDoble c){
        cola = c;
    }

    public boolean esVacia(){
        return cabeza == null;
    }

    public void adiInicio(int valor){
        NodoDoble nuevo = new NodoDoble(valor);
        if (esVacia()){
            cabeza = cola = nuevo;
        }
        else{
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
    }

    public void adiFinal(int valor){
        NodoDoble nuevo = new NodoDoble(valor);
        if (esVacia()){
            cabeza = cola = nuevo;
        }
        else{
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
    }

    public void eliminar(int valor){
        if (esVacia()){
            return;
        }
        NodoDoble actual = cabeza;
        while (actual != null && actual.getDato() != valor){
            actual = actual.getSiguiente();
        }

        if (actual == null){
            return;
        }

        if (actual == cabeza){
            cabeza = cabeza.getSiguiente();
            if (cabeza != null){
                cabeza.setAnterior(null);
            }
            else {
                cola = null;
            }
        }
        else if (actual == cola){
            cola = cola.getAnterior();
            cola.setSiguiente(null);
        }

        else{
            actual.getAnterior().setSiguiente(actual.getSiguiente());
            actual.getSiguiente().setAnterior(actual.getAnterior());
        }

    }

    public void imprimirAdelante(){
        NodoDoble actual = cabeza;
        while (actual != null){
            System.out.print(actual.getDato() + " <-> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    public void imprimirAtras(){
        NodoDoble actual = cola;
        while (actual != null){
            System.out.print(actual.getDato() + " <-> ");
            actual = actual.getAnterior();
        }
        System.out.println("null");
    }


}
