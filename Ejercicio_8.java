import java.util.Random;

public class Ejercicio_8 {
    public static void main(String[] args) {

        String cadenaADN = generarCadenaADNAleatoria(1000); // Longitud de la cadena aleatoria


        int numeroGenes = contarGenes(cadenaADN);

        System.out.println("La cadena de ADN aleatoria es: " + cadenaADN);
        System.out.println("Número de genes encontrados: " + numeroGenes);
    }

    public static String generarCadenaADNAleatoria(int longitud) {
        String bases = "ATCG";
        Random random = new Random();
        StringBuilder cadena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(bases.length());
            cadena.append(bases.charAt(indice));
        }

        return cadena.toString();
    }

    public static int contarGenes(String cadenaADN) {
        int contadorGenes = 0;
        int indice = cadenaADN.indexOf("ATG");

        while (indice != -1) {
            contadorGenes++;
            indice = cadenaADN.indexOf("ATG", indice + 3); // Buscar la próxima ocurrencia de "ATG"
        }

        return contadorGenes;
    }
}
