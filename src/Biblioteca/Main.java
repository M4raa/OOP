package Biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> biblioteca = new ArrayList<>();
        Autor juan = new Autor("Juan", 1);
        Tema fantasia = new Tema("Fantasía", 1);
        Editorial anaya = new Editorial("Anaya", 1);
        Libro libro1 = new Libro("La guerra de las galaxias", "124S12467", anaya, fantasia);
        biblioteca.add(libro1);
        libro1.addAutores(juan);
        for (Libro l:biblioteca) {
            System.out.printf("%s",l);

            /*for (:
                 ) {

            }*/
        }

    }
}
