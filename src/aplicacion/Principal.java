package aplicacion;

import palabras.CalculadoraDistancias;

public class Principal {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Se requieren al menos dos palabras como argumentos.");
            return; // Salir del programa si no hay suficientes argumentos
        }

        String palabra1 = args[0];
        String palabra2 = args[1];

        System.out.println("La distancia entre las palabras " + palabra1 + " y " + palabra2 + " es " +
                CalculadoraDistancias.calcularDistancia(palabra1, palabra2));
    }
}

