package Biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String nombre;
    private String isbn;
    private Set<Autor> autores;
    private Editorial editorial;
    private Tema tema;
    private Set<Ejemplar> ejemplares;

    public Libro(String nombre, String isbn, Editorial editorial, Tema tema) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.autores = new HashSet<>();
        this.editorial = editorial;
        this.tema = tema;
        this.ejemplares = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Set<Autor> getAutores() {
        return autores;
    }
    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
    public void addAutores(Autor autores) {
        this.autores.add(autores);
    }
    public Editorial getEditorial() {
        return editorial;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    public Tema getTema() {
        return tema;
    }
    public void setTema(Tema tema) {
        this.tema = tema;
    }
    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return " [ " + nombre + " " + autores
                 + " " + isbn + " " + editorial + " " + tema + " " + ejemplares +" ] ";
    }
}
