import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el texto: ");
        String texto = scanner.nextLine();

        System.out.println("El texto invertido es: " + invertirTexto(texto));

        scanner.close();
    }

    public static String invertirTexto(String texto) {
        if (texto.isEmpty()) {
            return texto;
        } else {
            char ultimoCaracter = texto.charAt(texto.length() - 1);
            return ultimoCaracter + invertirTexto(texto.substring(0, texto.length() - 1));
        }
    }
}
