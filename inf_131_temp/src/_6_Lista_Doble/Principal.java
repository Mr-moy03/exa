package _6_Lista_Doble;

public class Principal {
    public static void main(String[] args) {
        ListaDoble list = new ListaDoble();
        list.adiInicio(2);
        list.adiInicio(1);
        list.adiFinal(3);
        list.adiFinal(4);

        list.imprimirAdelante();
        list.imprimirAtras();
    }
}
