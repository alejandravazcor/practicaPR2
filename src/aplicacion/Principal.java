package aplicacion;

import mates.Matematicas;

/**
 * La clase Principal contiene el método principal (main) que ejecuta la aplicación para estimar el número Pi.
 */
public class Principal {
     /**
     * Método principal que se ejecuta al iniciar la aplicación.
     *
     * @param args Los argumentos de la línea de comandos. Se espera un argumento: <numero_de_pasos>.
     */
     public static void main(String[] args) {
      // Verifica que se proporcione un solo argumento en la línea de comandos.
        if (args.length != 1) {
            System.out.println("Uso: java Principal <numero_de_pasos>");
            System.exit(1);
        }
          // Convierte el argumento proporcionado a un valor numérico (cantidad de pasos).
        long pasos = Long.parseLong(args[0]);
          // Imprime la estimación de Pi basada en el número de pasos proporcionados.
        System.out.println("El numero Pi es " + Matematicas.generarNumeroPiMontecarlo(pasos));
    }
}
