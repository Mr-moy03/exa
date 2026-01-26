package _6_Lista_Doble;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ListaDoble ls = new ListaDoble();

        for (int i = 0;i < 10;i++){
            ls.adiFinal(0);
        }
        ls.imprimirAdelante();

        ingresarXnumero(ls);
        ls.imprimirAdelante();


    }
    public static void ingresarXnumero(ListaDoble ls){
        NodoDoble aux = ls.getCabeza();
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
