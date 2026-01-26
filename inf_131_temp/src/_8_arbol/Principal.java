package _8_arbol;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean sw = true;
        while (sw == true){
            System.out.println("\nMenú del Árbol Binario de Búsqueda:");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Buscar");
            System.out.println("4. Recorrido Inorden");
            System.out.println("5. Recorrido Preorden");
            System.out.println("6. Recorrido Postorden");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            if(opcion == 1){
                System.out.print("Ingrese el valor a insertar: ");
                int valorInsertar = scanner.nextInt();
                arbol.insertar(valorInsertar);
                System.out.println("Valor insertado.");
            }
            else if(opcion == 2){
                System.out.print("Ingrese el valor a eliminar: ");
                int valorEliminar = scanner.nextInt();
                arbol.eliminar(valorEliminar);
                System.out.println("Valor eliminado (si existía).");
            }
            else if(opcion == 3){
                System.out.print("Ingrese el valor a buscar: ");
                int valorBuscar = scanner.nextInt();
                if (arbol.buscar(valorBuscar)) {
                    System.out.println("Valor encontrado.");
                } else {
                    System.out.println("Valor no encontrado.");
                }
            }
            else if(opcion == 4){
                System.out.print("Recorrido Inorden: ");
                arbol.inorden();
            }
            else if(opcion == 5){
                System.out.print("Recorrido Preorden: ");
                arbol.preorden();
            }
            else if(opcion == 6){
                System.out.print("Recorrido Postorden: ");
                arbol.postorden();
            }
            else if(opcion == 7){
                System.out.println("Saliendo...");
                break;
            }
            else if(opcion != 8){
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
