package mates;

import java.util.Random;

public class Matematicas {

    public static double generarNumeroPiRecursivo(long pasos) {
        Random rand = new Random();
        return generarNumeroPiRecursivoAux(pasos, 0, rand);
    }

    private static double generarNumeroPiRecursivoAux(long pasos, long dentroCirculo, Random rand) {
        if (pasos == 0) {
            double proporcion = (double) dentroCirculo / pasos;
            return 4 * proporcion;
        } else {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            double distanciaAlOrigen = Math.sqrt(x * x + y * y);
            if (distanciaAlOrigen <= 1) {
                dentroCirculo++;
            }
            return generarNumeroPiRecursivoAux(pasos - 1, dentroCirculo, rand);
        }
    }
}
