package mates;

import java.util.Random;
import java.util.*;
import java.util.random.RandomGenerator;

/**
 * La clase Matematicas proporciona métodos para cálculos matemáticos.
 */
public class Matematicas {
    /**
     * Genera una estimación de la constante matemática Pi utilizando un método recursivo.
     *
     * @param dardosDisponibles El número de dardos disponibles para la estimación.
     * @return Una estimación de Pi basada en el método de Monte Carlo.
     */


package mates;

import java.util.Random;

public class Matematicas {
    /**
     * Genera una aproximación al número Pi mediante el método de Montecarlo.
     * El parámetro `dardosDisponibles` indica el número de puntos generados.
     */
    public static double generarNumeroPiMontecarlo(long dardosDisponibles) {
        Random random = new Random();
        long aciertos = 0;

        for (long i = 0; i < dardosDisponibles; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double radio = Math.sqrt(x * x + y * y);
            if (radio <= 1.0) {
                aciertos++;
            }
        }

        return 4.0 * (double) aciertos / (double) dardosDisponibles;
    }
	/**
     * Método auxiliar para generar Pi de manera recursiva utilizando el método de Monte Carlo.
     *
     * @param dardosDisponibles El total de dardos disponibles para la estimación.
     * @param lanzamientos      El número actual de lanzamientos de dardos.
     * @param aciertos          El número actual de aciertos de dardos dentro del círculo unitario.
     * @return Una estimación de Pi basada en el método de Monte Carlo.
     */

    public static void main(String[] args) {
        long dardosDisponibles = 10000000;
        double piEstimado = generarNumeroPiMontecarlo(dardosDisponibles);
        System.out.println("Aproximación de Pi utilizando Monte Carlo: " + piEstimado);
    }
}
 }

