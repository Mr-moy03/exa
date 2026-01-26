package _8_arbol;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda(){
        this.raiz = null;
    }

    public void insertar(int dato){
        this.raiz = insertarRec(raiz,dato);
    }

    private Nodo insertarRec(Nodo nodoActual, int dato) { // Cambié nombre a 'nodoActual' para evitar confusión
        if (nodoActual == null) {
            return new Nodo(dato);
        }

        // Usamos nodoActual, NO this.raiz
        if (dato < nodoActual.getDato()) {
            nodoActual.setIzquierdo(insertarRec(nodoActual.getIzquierdo(), dato));
        } else if (dato > nodoActual.getDato()) {
            nodoActual.setDerecho(insertarRec(nodoActual.getDerecho(), dato));
        }
        return nodoActual;
    }

    public void eliminar(int dato){
        raiz = eliminarRec(raiz,dato);
    }

    private Nodo eliminarRec(Nodo nodoActual, int dato) {
        if (nodoActual == null) {
            return null;
        }

        if (dato < nodoActual.getDato()) {
            nodoActual.setIzquierdo(eliminarRec(nodoActual.getIzquierdo(), dato));
        } else if (dato > nodoActual.getDato()) {
            nodoActual.setDerecho(eliminarRec(nodoActual.getDerecho(), dato));
        } else {
            // Encontramos el nodo a eliminar

            // Caso 1: Sin hijos o un solo hijo
            if (nodoActual.getIzquierdo() == null) return nodoActual.getDerecho();
            if (nodoActual.getDerecho() == null) return nodoActual.getIzquierdo();

            // Caso 2: Dos hijos
            // 1. Obtener el menor del lado derecho (sucesor)
            int minVal = minValor(nodoActual.getDerecho());
            // 2. Reemplazar el dato del nodo actual
            nodoActual.setDato(minVal);
            // 3. Eliminar el nodo duplicado en la rama derecha (OJO AQUÍ: pasamos minVal, no dato)
            nodoActual.setDerecho(eliminarRec(nodoActual.getDerecho(), minVal));
        }
        return nodoActual;
    }

    private int minValor(Nodo raiz) {
        int minv = raiz.getDato();
        while (raiz.getIzquierdo() != null) {
            minv = raiz.getIzquierdo().getDato();
            raiz = raiz.getIzquierdo();
        }
        return minv;
    }

    public boolean buscar(int dato) {
        return buscarRec(raiz, dato);
    }

    private boolean buscarRec(Nodo raiz, int dato) {
        if (raiz == null) return false;
        if (raiz.getDato() == dato) return true;
        return dato < raiz.getDato() ? buscarRec(raiz.getIzquierdo(), dato) : buscarRec(raiz.getDerecho(), dato);
    }

    // Método para recorrido inorden [cite: 154]
    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.getIzquierdo());
            System.out.print(raiz.getDato() + " ");
            inordenRec(raiz.getDerecho());
        }
    }

    // Método para recorrido preorden [cite: 166]
    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.getDato() + " ");
            preordenRec(raiz.getIzquierdo());
            preordenRec(raiz.getDerecho());
        }
    }

    // Método para recorrido postorden [cite: 181]
    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo raiz) {
        if (raiz != null) {
            postordenRec(raiz.getIzquierdo());
            postordenRec(raiz.getDerecho());
            System.out.print(raiz.getDato() + " ");
        }
    }
}
