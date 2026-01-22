package test_1;
import javax.swing.JOptionPane;

public class JOption {
    public static void main(String[] args) {

        /*

        String num1 = JOptionPane.showInputDialog("Introduzca el primer valor");
        String num2 = JOptionPane.showInputDialog("Introduzca el segundo valor");

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int resSuma = suma(n1, n2);
        int resResta = resta(n1, n2);
        int resMulti = multiplicacion(n1, n2);
        int resDiv = division(n1, n2);



        String mensaje = "Resultados:\n" + "Suma: " + resSuma + "\n" +
                "Resta: " + resResta + "\n" +
                "Multiplicación: " + resMulti + "\n" +
                "División: " + resDiv;

        JOptionPane.showMessageDialog(null, mensaje);
        */

    }


    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }
}