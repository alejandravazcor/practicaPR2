package mates;

import java.util.Random;
import java.util.stream.LongStream;
import java.util.*;

/**
 * Esta clase proporciona métodos para realizar cálculos matemáticos, incluida la estimación del número Pi
 * mediante el método de Monte Carlo.
 */
public class Matematicas {
    /**
     * Genera una aproximación al número Pi mediante el método de Montecarlo.
     * El parámetro `dardosDisponibles` indica el número de puntos generados.
	* @param dardosDisponibles El número de dardos disponibles para generar puntos.
     * @return Una aproximación del valor de Pi.
     */
    public static double generarNumeroPiMontecarlo(long dardosDisponibles) {
        Random random = new Random();
	
        long puntosDentroCirculo = LongStream.range(0, dardosDisponibles)
	.filter(i -> {
            double x = random.nextDouble();
            double y = random.nextDouble();
            return x * x + y * y <= 1;
             })
             .count();
            
	return 4.0 * puntosDentroCirculo / dardosDisponibles;
}}
