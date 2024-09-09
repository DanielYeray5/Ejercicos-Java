
import javax.swing.JOptionPane;

public class Ejer11 {
    public static void main(String[] args) {
        
        String dia = JOptionPane.showInputDialog(null,"Ingresa un dia de la semana");

        switch (dia) {
            case "Lunes":
            case "lunes":
            case "Martes":
            case "martes":
            case "Miercoles":
            case "miercoles":
            case "Jueves":
            case "jueves":
            case "Viernes":
            case "viernes":
            System.out.println("Es un dia laboral");
            break;
            case "Sabado":
            case "sabado":
            case "Domingo":
            case "domingo":
            System.out.println("Es un fin de semana");
            break;
            default:
            System.out.println("No se pudo saber el dia");
            break;
        }
    }
}
