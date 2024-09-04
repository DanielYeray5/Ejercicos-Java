import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        double pi = 3.1416;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el radio del circulo");
        double radio = scanner.nextDouble();

        double operacion = pi * (radio * radio);

        System.out.println("El área del círculo es: " + operacion);

        scanner.close();
    }
}
