import javax.swing.JOptionPane;

public class Ejer1 {
    public static void main(String[] args) {
        int sueldo;
        double aumento;
        String trabajador;

        trabajador = JOptionPane.showInputDialog(null, "Ingresa nombre del trabajador");
        sueldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el sueldo"));

        if (sueldo <= 5000) {
            aumento = sueldo * 0.10;
            sueldo += aumento;
        } else if (sueldo < 9000) {
            aumento = sueldo * 0.50;
            sueldo += aumento;
        }else if(sueldo > 10000){
            aumento = sueldo * 0.80;
            sueldo += aumento;
        }else if (sueldo < 15000){
            aumento = sueldo * 1;
            sueldo += aumento;
        }
        System.out.println("Trabajador: " + trabajador);
        System.out.println("Tu sueldo es " + sueldo);
    }
}