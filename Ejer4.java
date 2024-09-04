import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el precio del producto");
        double precio = scanner.nextDouble();
        double iva = 0.21;
        double resultado = precio + (precio * iva);
        System.out.println("El resultado con IVA es: " + resultado);
        
        scanner.close();
    }
}
