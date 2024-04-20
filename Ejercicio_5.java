import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        int maximo = encontrarMaximo(vector, n);
        System.out.println("El valor máximo del vector es: " + maximo);

        scanner.close();
    }

    public static int encontrarMaximo(int[] vector, int n) {
        if (n == 1) {
            return vector[0];
        } else {
            return Math.max(vector[n - 1], encontrarMaximo(vector, n - 1));
        }
    }
}
