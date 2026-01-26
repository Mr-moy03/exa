package _2_Colas;

import _1_Pila.Pila;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ColaSimple c = new ColaSimple(50);
        Scanner sc = new Scanner(System.in);
        int valor;
        int dato;
        boolean sw = true;
        while (sw == true){
            System.out.println("-- Menu Cola Simple --");
            System.out.println("-- 1. Insertar dato --");
            System.out.println("-- 2. Eliminar el ultimo dato --");
            System.out.println("-- 3. Mostrar datos--");
            System.out.println("-- 4. Salir --");
            //System.out.println("-- Menu Pila --");
            System.out.print("Seleccionar: ");
            valor = sc.nextInt();

            if (valor == 1){
                System.out.println("Inserte el dato ala cola: ");
                dato = sc.nextInt();
                c.push(dato);
            }
            else if (valor == 2){
                System.out.println("elimar el el ultima dato de la cola");
                c.pop();
            }
            else if (valor == 3){
                System.out.println("Mostrar pila completa");
                c.mostrar();
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
