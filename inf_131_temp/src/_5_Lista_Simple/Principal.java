package _5_Lista_Simple;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        LS_simple ls = new LS_simple();

        for (int i = 0;i < 10;i++){
            ls.adiFinal(0);
        }
        ls.imprimir();

        //ingresarXnumero(ls);
        //ls.imprimir();
        /*
        LS_simple lista1 = new LS_simple();
        lista1.adiInicio(3);
        lista1.adiInicio(2);
        lista1.adiInicio(1);
        lista1.adiFinal(4);
        lista1.imprimir();
        lista1.eliminar(3);
        lista1.imprimir();

       //LS_simple lista1 = new LS_simple();
       */

        Scanner sc = new Scanner(System.in);
        int opcionMenu = 0;
        int valor;
        do {
            System.out.println("\n |-------------------------------------|");
            System.out.println(" |      ° LISTA ENLAZADA SIMPLE °      |");
            System.out.println(" |-------------------------------------|");
            System.out.println(" | 1. Insertar al Inicio               |");
            System.out.println(" | 2. Insertar al Final                |");
            System.out.println(" | 3. Eliminar Dato                    |");
            System.out.println(" | 4. Desplegar Lista                  |");
            System.out.println(" | 5. Ingregar un numero random en un posicion|");
            System.out.println(" | 6. Salir                            |");
            System.out.println(" |-------------------------------------|");
            System.out.print(" Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("\n\n INSERTA NODO AL INICIO \n");
                    System.out.print("Ingrese el valor: ");
                    valor = sc.nextInt();
                    ls.adiInicio(valor);
                    break;
                case 2:
                    System.out.println("\n\n INSERTA NODO AL FINAL \n");
                    System.out.print("Ingrese el valor: ");
                    valor = sc.nextInt();
                    ls.adiFinal(valor);
                    break;
                case 3:
                    System.out.println("\n\n ELIMINAR UN NODO DE LA LISTA \n");
                    System.out.print("Ingrese el valor a eliminar: ");
                    valor = sc.nextInt();
                    ls.eliminar(valor);
                    break;
                case 4:
                    System.out.println("\n\n DESPLEGAR LISTA DE NODOS \n");
                    ls.imprimir();
                    break;
                case 5:
                    System.out.println("\n\n Ingrese una posicion ... \n");
                    valor = sc.nextInt();
                    ingresarXnumero(ls,valor);
                    break;
                case 6:
                    System.out.println("\n\n Programa finalizado... \n");
                    break;
                default:
                    System.out.println("\n\n Opcion No Valida \n");
                    break;
            }
        } while (opcionMenu != 6);

        sc.close();
    }

    public static void ingresarXnumero(LS_simple ls,int pos){
        Nodo aux = ls.getCabeza();
        int elem;
        int cont = 1;
        Random rand = new Random();
        while (aux != null){
            elem = aux.getDato();
            if (cont == pos){
                int numero = rand.nextInt(100);
                aux.setDato(numero);
            }
            //System.out.println(elem);
            aux = aux.getSiguiente();
            cont += 1;
        }
    }
}