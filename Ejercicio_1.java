public class Ejercicio_1 {
    public static void main(String[] args) {
        int n = 5; // Cambia este valor según tus necesidades
        int suma = sumaNaturales(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
    }

    public static int sumaNaturales(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }
}
