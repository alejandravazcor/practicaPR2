package mates.mates;

import java.util.Random;
import java.util.*;
import java.util.random.RandomGenerator;

public class Matematicas {
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * * i=contador de lanzamientos lso lanzamientos inicialmente son 0
     * * dardos Disponibles (ARGS (O) ) es el primer parametro que introduzco por consola (hay que usar integerparseint)
     * * f¿EL numero de lanzamientos (int) es menor  a los dardos que tengo disponibles?
     * * si es SI es menor o igual entonces tengo que lanzar dardos luego me pregunto ¿El dardo ha caido dentro?
     * * si la respuesta es si, entonces hago acierto es aciertos+1 incremento y tambien tengo que incrementar los dardos que he lanzado
     * * tengo que generar dos numeros aleatorios entre el 0 y 1 (random) y eso es el lanzar dardos ¿ como se generan numero s aleatorios en java?
     * * ¿Como se si el dardo ha caido dentro si el centro esta en o,5 , 0,5  tengo que coger el si me sale menor o igual que el radio es que me ha caido dentro y si me sale mayor o igual qeu el radio es que me ha caido fuera
     * * la programacions del segundo rombo es calcular el radio y luego pasar al sigueinte paso
     */
    public static double generarNumeroPiIterativo(long dardosDisponibles) {

        Random generadorNumerosAleatorios = new Random();
        long aciertos = 0;
        for (long i = 0; i < dardosDisponibles; i++) {

            double x = generadorNumerosAleatorios.nextDouble();
            double y = generadorNumerosAleatorios.nextDouble();
            double radio = Math.sqrt(x * x + y * y);
            if (radio <= 1.0) {
                aciertos++;

            }
        }
        return 4.0 * (double) aciertos / (double) dardosDisponibles;
    }
}
