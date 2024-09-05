import java.util.Scanner;

public class Ejer5 {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Ingresa un numero a dividir");
        int numero = terminal.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero " + numero + " es divisible entre 2");
        }else{
            System.out.println("El numero " + numero + " no es divisible entre 2");
        }

        terminal.close();
    }
}
