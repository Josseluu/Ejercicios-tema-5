import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número de dígitos en " + numero + " es: " + cantidadDigitos);

        scanner.close();
    }

    public static int contarDigitos(int numero) {
        if (numero < 10 && numero >= 0) {
            return 1;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }
}
