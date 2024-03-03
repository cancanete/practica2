package aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java aplicacion.Principal <numero_pasos>");
            return;
        }

        try {
            long pasos = Long.parseLong(args[0]);
            if (pasos <= 0) {
                System.out.println("El número de pasos debe ser mayor que cero.");
                return;
            }
            System.out.println("El número PI es " + Matematicas.generarNumeroPiRecursivo(pasos));
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca un número válido de pasos.");
        }
    }
}
