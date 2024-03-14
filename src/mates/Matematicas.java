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
    public static double generarNumeroPiMontecarlo(long dardosDisponibles) {
        long aciertos = ThreadLocalRandom.current().longs(dardosDisponibles, 0, Long.MAX_VALUE)
                .parallel()
                .filter(i -> {
                    double x = ThreadLocalRandom.current().nextDouble();
                    double y = ThreadLocalRandom.current().nextDouble();
                    double radio = Math.sqrt(x * x + y * y);
                    return radio <= 1.0;
                })
                .count();

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

	}
