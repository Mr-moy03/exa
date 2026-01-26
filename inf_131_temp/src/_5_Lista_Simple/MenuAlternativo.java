package _5_Lista_Simple;

import java.util.Scanner;

public class MenuAlternativo {
    public static void main(String[] args) {
        LS_simple ls = new LS_simple();
        Scanner sc = new Scanner(System.in);
        int opcionMenu = 0;
        int valor;
        boolean sw = true;
        while (sw == true){
            System.out.println("\n |-------------------------------------|");
            System.out.println(" |      ° LISTA ENLAZADA SIMPLE °      |");
            System.out.println(" |-------------------------------------|");
            System.out.println(" | 1. Insertar al Inicio               |");
            System.out.println(" | 2. Insertar al Final                |");
            System.out.println(" | 3. Eliminar Dato                    |");
            System.out.println(" | 4. Desplegar Lista                  |");
            System.out.println(" | 5. Salir                            |");
            System.out.println(" |-------------------------------------|");
            System.out.print(" Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            if (opcionMenu == 1){System.out.println("\n\n INSERTA NODO AL INICIO \n");
                System.out.print("Ingrese el valor: ");
                valor = sc.nextInt();
                ls.adiInicio(valor);
            }
            else if (opcionMenu == 2){
                System.out.println("\n\n INSERTA NODO AL FINAL \n");
                System.out.print("Ingrese el valor: ");
                valor = sc.nextInt();
                ls.adiFinal(valor);
            }
            else if (opcionMenu == 3){
                System.out.println("\n\n ELIMINAR UN NODO DE LA LISTA \n");
                System.out.print("Ingrese el valor a eliminar: ");
                valor = sc.nextInt();
                ls.eliminar(valor);
            }
            else if (opcionMenu == 4){
                System.out.println("\n\n DESPLEGAR LISTA DE NODOS \n");
                ls.imprimir();
            }
            else if (opcionMenu == 5){
                System.out.println("\n\n Programa finalizado... \n");
                break;
            }
            else if (opcionMenu != 6){
                System.out.println("\n\n Opcion No Valida \n");
            }
        }
    }
}


