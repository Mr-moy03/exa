package Pila;

public class Principal {
    public static void main(String[] args) {
        Pila p1 = new Pila(10);
        p1.push(7);
        p1.push(8);
        p1.push(9);
        p1.push(71);
        p1.push(12);

        p1.mostrar();

        p1.inversa().mostrar();

    }
}
