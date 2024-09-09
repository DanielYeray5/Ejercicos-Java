
import javax.swing.JOptionPane;

public class Ejer12 {

    public static void main(String[] args) {
        String texto1 = JOptionPane.showInputDialog("Introduce el primero numero");
        int num1 = Integer.parseInt(texto1);

        String texto2 = JOptionPane.showInputDialog("Introduce el segundo numero");
        int num2 = Integer.parseInt(texto2);

        for (int i = 0; i < 10; i++) {
            int numAleatorio = (int) Math.floor(Math.random() * (num1 - num2) + num2);
            System.out.println(numAleatorio);
        }
    }
}
