package _6_Lista_Doble;

import _5_Lista_Simple.LS_simple;
import _5_Lista_Simple.Nodo;

public class Ejercicio {
    public static void main(String[] args) {
        LS_simple ls = new LS_simple();
        ls.adiFinal(1);
        ls.adiFinal(2);
        ls.adiFinal(3);

        ls.imprimir();
        invertir(ls);
        ls.imprimir();

    }
    public static void invertir(LS_simple ls){
        Nodo ant = null;
        Nodo act = ls.getCabeza();
        Nodo sig = null;
        while (act != null){
            sig = act.getSiguiente();
            act.setSiguiente(ant);
            ant = act;
            act = sig;
        }
        ls.setCabeza(ant);

    }

}
