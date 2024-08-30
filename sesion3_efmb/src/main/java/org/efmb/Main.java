package org.efmb;

import models.Curso;
import models.Departamento;
import models.Profesor;
import models.Biblioteca;
import models.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("*".repeat(13));
        Curso curso = new Curso("Metodologia y POO");
        Profesor duran = new Profesor("Jose Duran");
        duran.enseñar(curso);
        Departamento fia = new Departamento();
        fia.setNombre("FIA");
        Profesor noel = new Profesor("Noel Gavarrete");
        fia.agregarProfesor(noel);
        fia.agregarProfesor(duran);
        System.out.println(fia.getNombre());
        for(Profesor doc : fia.getProfesores()){
            System.out.println(doc.getNombre());
        }

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("El Quijote");
        biblioteca.agregarLibro("Cien Años de Soledad");
        System.out.println("Libros en la biblioteca:");
        for (Biblioteca.Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.getTitulo());
        }

        // Relación de Generalización
        Animal animalGenerico = new Animal();
        animalGenerico.hacerSonido();

        Animal.Perro miPerro = animalGenerico.new Perro();
        miPerro.hacerSonido();

    }
}
