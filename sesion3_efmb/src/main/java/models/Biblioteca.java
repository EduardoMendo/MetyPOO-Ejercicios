package models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(String titulo) {
        libros.add(new Libro(titulo));
    }

    // Clase interna Libro
    public class Libro {
        private String titulo;

        public Libro(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }

    public List<Libro> getLibros() {
        return libros;
    }
}
