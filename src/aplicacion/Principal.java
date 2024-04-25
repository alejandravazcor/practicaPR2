package aplicacion;

import palabras.CalculadoraDistancias;
/**
 * La clase Principal es la entrada principal del programa.
 * Calcula y muestra la distancia entre dos palabras proporcionadas como argumentos de línea de comandos.
 */
public class Principal {
 /**
     * El método principal que se ejecuta al iniciar el programa.
     * 
     * @param args Los argumentos de línea de comandos. Se esperan dos palabras.
     */
    public static void main(String[] args) {
	// Verificar si se proporcionaron suficientes argumentos
        if (args.length < 2) {
            System.out.println("Se requieren al menos dos palabras como argumentos.");
            return; // Salir del programa si no hay suficientes argumentos
        }
	// Obtener las palabras proporcionadas como argumentos
        String palabra1 = args[0];
        String palabra2 = args[1];
	// Calcular y mostrar la distancia entre las palabras
        System.out.println("La distancia entre las palabras " + palabra1 + " y " + palabra2 + " es " +
                CalculadoraDistancias.calcularDistancia(palabra1, palabra2));
    }
}

