import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el valor de y: ");
        int y = scanner.nextInt();

        int resultado = potencia(x, y);
        System.out.println(x + " elevado a la potencia " + y + " es: " + resultado);

        scanner.close();
    }

    public static int potencia(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * potencia(x, y - 1);
        }
    }
}
