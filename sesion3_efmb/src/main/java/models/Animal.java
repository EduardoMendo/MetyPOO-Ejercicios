package models;

public class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico: ");
    }

    // Clase interna Perro que extiende Animal
    public class Perro extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("Guau guau");
        }
    }
}


