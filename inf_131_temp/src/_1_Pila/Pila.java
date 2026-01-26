package _1_Pila;

public class Pila {
    public int max;
    public int tope;
    public int datos[];

    public Pila(int tamaño){
        max = tamaño;
        datos = new int[max];
        tope = -1;
    }

    public boolean esLlena(){
        return tope == datos.length - 1;
    }

    public boolean esVacia(){
        return tope == -1;
    }

    public void push(int elem){
        if(esLlena() == true){
            System.out.println("Pila Llena!!!");
        }
        else{
            tope++;
            datos[tope] = elem;
        }
    }

    public int pop(){
        int aux;
        if(esVacia() == true){
            System.out.println("Pila vacia!!!!");
            return -1;
        }
        else{
            aux = datos[tope];
            this.tope--;
        }
        return aux;
    }

    public void mostrar() {
        if (esVacia()) {
            System.out.println("La pila está vacía, ingrese datos.");
            return;
        }

        System.out.println("Valores de la Pila");
        for (int c = tope; c >= 0; c--) {
            System.out.println("\t" + datos[c] + "\t");
        }
    }

    public int nroElem(){
        return tope + 1;
    }

    public int fondo(){
        if (tope >= 0){
            return datos[0];
        }
        else {
            System.out.println("Pila Vacia");
            return -1;
        }
    }

    public Pila inversa(){
        Pila invertida = new Pila(max);
        for (int i = tope; i >= 0; i--){
            invertida.push(datos[i]);
        }
        return invertida;
    }
}