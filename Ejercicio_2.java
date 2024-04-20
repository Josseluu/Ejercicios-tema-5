
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número (d): ");
        int d = scanner.nextInt();

        System.out.println("La lista de números naturales entre " + a + " y " + d + " es:");
        imprimirNaturales(a, d);

        scanner.close();
    }

    public static void imprimirNaturales(int a, int d) {
        if (a <= d) {
            System.out.print(a + " ");
            imprimirNaturales(a + 1, d);
        }
    }
}
