package Pila_Menu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Pila p = new Pila();
        int opcionMenu = 0;

        do {
            System.out.println("\n |----------------------------------|");
            System.out.println(" |      ° CONCEPTO DE PILA °        |");
            System.out.println(" |-------------------|--------------|");
            System.out.println(" | 1. Insertar       | 4. Eliminar  |");
            System.out.println(" | 2. Buscar         | 5. Desplegar |");
            System.out.println(" | 3. Modificar      | 6. Salir     |");
            System.out.println(" |-------------------|--------------|");
            System.out.print(" Escoja una Opción: ");
            opcionMenu = Teclado.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("\n\n INSERTA NODO EN LA PILA \n");
                    //p.ingresarNodo();
                    break;
                case 2:
                    System.out.println("\n\n BUSCAR UN NODO EN LA PILA \n");
                    //p.buscarNodo();
                    break;
                case 3:
                    System.out.println("\n\n MODIFICAR UN NODO DE LA PILA \n");
                    //p.modificarNodo();
                    break;
                case 4:
                    System.out.println("\n\n ELIMINAR UN NODO DE LA PILA \n");
                    //p.eliminarNodo();
                    break;
                case 5:
                    System.out.println("\n\n DESPLEGAR PILA DE NODOS \n");
                    //p.desplegarPila();
                    break;
                case 6:
                    System.out.println("\n\n Programa finalizado... \n");
                    break;
                default:
                    System.out.println("\n\n Opcion No Valida \n");
                    break;
            }
        } while (opcionMenu != 6);
    }

}
