import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el valor de k: ");
        int k = scanner.nextInt();

        int coeficiente = calcularCoeficienteBinomial(n, k);
        System.out.println("El coeficiente binomial C(" + n + ", " + k + ") es: " + coeficiente);

        scanner.close();
    }

    public static int calcularCoeficienteBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calcularCoeficienteBinomial(n - 1, k) + calcularCoeficienteBinomial(n - 1, k - 1);
        }
    }
}
