import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio_9 {
    public static void main(String[] args) {
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida_ordenada.txt";

        try {
            List<String> lineas = leerArchivo(archivoEntrada);
            Collections.sort(lineas);
            escribirArchivo(lineas, archivoSalida);
            System.out.println("El archivo se ha ordenado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    public static List<String> leerArchivo(String nombreArchivo) throws IOException {
        List<String> lineas = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String linea;

        while ((linea = lector.readLine()) != null) {
            lineas.add(linea);
        }

        lector.close();
        return lineas;
    }

    public static void escribirArchivo(List<String> lineas, String nombreArchivo) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));

        for (String linea : lineas) {
            escritor.write(linea);
            escritor.newLine();
        }

        escritor.close();
    }
}
