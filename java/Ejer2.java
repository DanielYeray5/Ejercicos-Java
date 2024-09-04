import javax.swing.JOptionPane;

public class Ejer2 {
    public static void main(String[] args) {
        int a,b;
        double suma, resta, multiplicacion, division;
        a =  Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
        b =  Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa otro numero"));

        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;
        double modulo = a % b;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division de los numeros es: " + division);
        System.out.println("El modulo de los numeros es: " + modulo);
    }
}
