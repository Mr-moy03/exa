package _1_Pila;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila p1 = new Pila(10);
        int valor;
        int dato;
        boolean sw = true;
        while (sw == true){
            System.out.println("-- Menu Pila --");
            System.out.println("-- 1. Insertar dato --");
            System.out.println("-- 2. Eliminar dato --");
            System.out.println("-- 3. Mostrar datos--");
            System.out.println("-- 4. Salir --");
            //System.out.println("-- Menu Pila --");
            System.out.print("Seleccionar: ");
            valor = sc.nextInt();

            if (valor == 1){
                System.out.println("Inserte el dato ala pila: ");
                dato = sc.nextInt();
                p1.push(dato);
            }
            else if (valor == 2){
                System.out.println("elimar el el ultima dato de la pila");
                p1.pop();
            }
            else if (valor == 3){
                System.out.println("Mostrar pila completa");
                p1.mostrar();
            }
            else if (valor == 4){
                System.out.printf("Programa Finalizado");
                break;
            }
            else if (valor != 4){
                System.out.println("Opcion Incorrecta");
            }

        }
        sc.close();


    }
}
