package test_1;

import javax.swing.*;

public class JOption_2 {
    public static void main(String[] args) {
        int opcion;
        boolean continuar = true;
        while (continuar){
            String num = JOptionPane.showInputDialog("Manejo de menus \n Selecione una opcion "+"\n1.-Numero invertido"
                    + "\n2.- Numero capicua \n3.-Cantidad de pares e impares en un numero" + "\n4.-Salir");

            opcion = Integer.parseInt(num);
            switch (opcion){
                case 1:
                    JOptionPane.showInputDialog("Case 1");
                    break;
                case 2:
                    JOptionPane.showInputDialog("Case 2");
                    break;
                case 3:
                    JOptionPane.showInputDialog("Case 3");
                    break;
                case 4:
                    continuar = false;
            }


        }
    }
}
