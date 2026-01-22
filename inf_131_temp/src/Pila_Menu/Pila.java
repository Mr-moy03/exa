package Pila_Menu;

public class Pila extends Nodo {

    // Clase interna Nodo
    private Nodo raiz; // cima de la pila

    public Pila() {
        raiz = null; // pila vacía
    }

    public void insertar(int x) {
        Nodo nuevo = new Nodo(); // crear nodo
        nuevo.info = x;          // guardar dato

        if (raiz == null) {
            // pila vacía
            nuevo.sig = null;
            raiz = nuevo;
        } else {
            // pila con elementos
            nuevo.sig = raiz;    // nuevo apunta al antiguo primero
            raiz = nuevo;        // ahora la cima es el nuevo nodo
        }
    }

    public int extraer() {
        if (raiz == null) {
            // pila vacía
            return Integer.MAX_VALUE; // valor especial de error en este ejemplo
        } else {
            int informacion = raiz.info; // dato del nodo superior
            raiz = raiz.sig;             // mover la cima al siguiente nodo
            return informacion;
        }
    }

    public boolean vacia() {
        return raiz == null;
    }

    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("Listado de todos los elementos de la pila:");
        while (reco != null) {
            System.out.print(reco.info + " - ");
            reco = reco.sig;
        }
        System.out.println();
    }
/*
    public void buscarNodo(){
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        System.out.print(" Ingrese el dato del nodo a buscar; ");
        int nodoBuscado = teclado.nextInt();
        if(primero != null && encontrado != true){
            while (actual != null){
                if (actual.ddato == nodoBuscado){
                    System.out.println("\n Nodo con el dato " + actual.dato + "Encontrado \n");
                    encontrado = true;
                }
                actual = actual.siguiente();

            }
            if(!encontrado){
                System.out.println("\n Nodo no encontrado \n");
            }
            else {
                System.out.println("\n la pila se encuentra vacia \n");
            }

        }

    }*/
    /*
    public void modificarNodo() {
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;

        System.out.println("ingrese el nodo a modificar");
        int nodoBuscado = teclado.nextInt();

        if (primero != null && encontrado != true) {
            while (actual != null) {
                if (actual.dato == nodoBuscado) {
                    System.out.println("ingrese el dato nuevo");
                    actual.dato = teclado.nextInt();
                    System.out.println("nodo modificado con exito");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }

            if (!encontrado) {
                System.out.println("nodo no encontrado");
            }
        } else {
            System.out.println("la pila esta vacia");
        }
    }*/
}