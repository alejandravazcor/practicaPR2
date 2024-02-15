package mates.aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Principal <numero_de_pasos>");
            System.exit(1);
        }
        long pasos = Long.parseLong(args[0]);
        System.out.println("EL numero Pi es " + Matematicas.generarNumeroPiIterativo(pasos));
    }
}
