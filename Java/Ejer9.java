
import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número de ventas ");
        int numVentas = scanner.nextInt();

        int sumVentas = 0;
        for (int i = 0; i < numVentas; i++){
            System.out.println("Ingresa el precio de la venta " + (i + 1) + ":");
            int venta = scanner.nextInt();

            sumVentas += venta;
        }
        System.out.println("El total de las ventas es de: " + sumVentas);
        scanner.close();
    }
}
