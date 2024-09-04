package org.efmb;

import models2.Cuenta;
import models2.Serie;

public class Main2 {
    public static void main(String[] args) {
        // Ejercicio 1: Cuenta
        Cuenta cuenta1 = new Cuenta("Kevin");
        Cuenta cuenta2 = new Cuenta("Edu", 1000);

        cuenta1.ingresar(500);
        cuenta2.retirar(200);

        System.out.println(cuenta1);
        System.out.println(cuenta2);

        // Ejercicio 2: Serie
        Serie serie1 = new Serie();
        Serie serie2 = new Serie("Breaking Bad", "Vince Gilligan");
        Serie serie3 = new Serie("Stranger Things", 4, "Ciencia Ficción", "Los Duffer Brothers");

        System.out.println(serie1);
        System.out.println(serie2);
        System.out.println(serie3);
    }
}

