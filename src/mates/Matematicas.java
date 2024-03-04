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
    public static double generarNumeroPiRecursivo(long dardosDisponibles) {
        return generarNumeroPiRecursivoAux(dardosDisponibles, 0, 0);
    }
	/**
     * Método auxiliar para generar Pi de manera recursiva utilizando el método de Monte Carlo.
     *
     * @param dardosDisponibles El total de dardos disponibles para la estimación.
     * @param lanzamientos      El número actual de lanzamientos de dardos.
     * @param aciertos          El número actual de aciertos de dardos dentro del círculo unitario.
     * @return Una estimación de Pi basada en el método de Monte Carlo.
     */

    public static double generarNumeroPiRecursivoAux(long dardosDisponibles, long lanzamientos, long aciertos) {
        if (lanzamientos < dardosDisponibles){ 
                double x = Math.random();
                double y = Math.random();
                double radio = Math.sqrt(x * x + y * y);

                if (radio <= 1.0) {
                    aciertos++;
                }

                return generarNumeroPiRecursivoAux(dardosDisponibles, lanzamientos + 1, aciertos);
            } else {
                return 4.0 * (double) aciertos / (double) dardosDisponibles;
            }
     	 }
	}
