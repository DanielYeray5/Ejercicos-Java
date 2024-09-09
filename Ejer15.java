
import javax.swing.JOptionPane;

public class Ejer15 {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                "Introduce un texto, cadena vacia para terminar",
                "Introducir texto",
                JOptionPane.INFORMATION_MESSAGE);

        String cadenaResultante = "";

        while (!texto.isEmpty()) {

            cadenaResultante += texto;

            texto = JOptionPane.showInputDialog(null,
                    "Introduce un texto, cadena vacia para terminar",
                    "Introducir texto",
                    JOptionPane.INFORMATION_MESSAGE);

        }

        JOptionPane.showMessageDialog(null,
                cadenaResultante,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
