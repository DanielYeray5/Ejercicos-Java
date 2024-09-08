
import java.util.Scanner;

public class Ejer14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta un numero entero mayor que 1");
        int num;

        do {
            num = scanner.nextInt();
            if (num <= 1) {
                System.out.println("Error. No has introducido un valor correcto."
                        + "Vuelve a intentarlo");
            }
        } while (!(num >= 1)); 
        int suma = 0;
        for (int contador = 1; contador <= num; contador++) {
            suma += contador;
        }
        System.out.println("La suma es: " + suma);
        scanner.close();
    }
}
