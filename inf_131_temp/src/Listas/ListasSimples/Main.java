package Listas.ListasSimples;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LS_simple ls = new LS_simple();

        for (int i = 0;i < 10;i++){
            ls.adiFinal(0);
        }
        ls.imprimir();

        ingresarXnumero(ls);
        ls.imprimir();


    }

    public static void ingresarXnumero(LS_simple ls){
        Nodo aux = ls.getCabeza();
        int elem;
        int cont = 1;
        Random rand = new Random();
        while (aux != null){
            elem = aux.getDato();
            if (cont == 4){
                int numero = rand.nextInt(100);
                aux.setDato(numero);
            }
            //System.out.println(elem);
            aux = aux.getSiguiente();
            cont += 1;
        }
    }
}
