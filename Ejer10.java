
import java.util.Scanner;

public class Ejer10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingresa un numero");
            numero = scanner.nextInt();
        } while (numero <= 0);

        System.out.println(numero);

        scanner.close();
    }
}
