package Biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> biblioteca = new ArrayList<>();
        ArrayList<Lector> lectores = new ArrayList<>();
        //Autores
            Autor juan = new Autor("Juan", 1);
            Autor pedro = new Autor("Pedro", 2);

        //Temas
            Tema fantasia = new Tema("Fantasía", 1);
            Tema misterio = new Tema("Misterio", 2);

        //Editoriales
            Editorial anaya = new Editorial("Anaya", 1);
            Editorial camello = new Editorial("Camello", 2);

        //Libros
            Libro libro1 = new Libro("La guerra de las galaxias", "124S12467", anaya, fantasia);
                Ejemplar ejemplar1 = new Ejemplar(1,libro1);
                Ejemplar ejemplar2 = new Ejemplar(2,libro1);
            Libro libro2 = new Libro("En busca del arca perdida", "18723JH3D", camello, misterio);
                Ejemplar ejemplar3 = new Ejemplar(3,libro2);
                Ejemplar ejemplar4 = new Ejemplar(4,libro2);

        //Lector
            Lector lector1 = new Lector("10250K");
            Lector lector2 = new Lector("56353S");
            Lector lector3 = new Lector("38468J");

        //Prestamos
        Prestamo prestamo1 = new Prestamo("15-05-2015",lector1);
        Prestamo prestamo2 = new Prestamo("16-04-2016",lector1);
        Prestamo prestamo3 = new Prestamo("12-06-2016",lector2);
        Prestamo prestamo4 = new Prestamo("23-01-2017",lector3);

        //Añadir
            //Añadir libros a la biblioteca y lectores
                biblioteca.add(libro1);
                biblioteca.add(libro2);
                lectores.add(lector1);
                lectores.add(lector2);
                lectores.add(lector3);
            //Añadimos ejemplares y autores al libro
                libro1.addAutores(juan);
                juan.addLibros(libro1);
                libro1.addEjemplares(ejemplar1);
                libro1.addEjemplares(ejemplar2);

                libro2.addAutores(pedro);
                pedro.addLibros(libro2);
                libro2.addEjemplares(ejemplar3);
                libro2.addEjemplares(ejemplar4);
            //Añadimos prestamos
            lector1.addPrestamos(prestamo1);
            prestamo1.addEjemplares(ejemplar1);
            ejemplar1.addPrestamos(prestamo1);

            lector1.addPrestamos(prestamo2);
            prestamo2.addEjemplares(ejemplar3);
            ejemplar3.addPrestamos(prestamo2);

            lector2.addPrestamos(prestamo3);
            prestamo3.addEjemplares(ejemplar2);
            ejemplar2.addPrestamos(prestamo3);

            lector3.addPrestamos(prestamo4);
            prestamo4.addEjemplares(ejemplar1);
            ejemplar1.addPrestamos(prestamo4);


        //Output
        for (Libro l:biblioteca) {
            System.out.println(l);
            for (Ejemplar e:l.getEjemplares()) {
                System.out.println("\t" + e);
                for (Prestamo p:e.getPrestamos()) {
                    System.out.println("\t\t" + p);
                }
            }
        }
        System.out.println();
        for (Lector le:lectores) {
            System.out.println(le);
            for (Prestamo pe:le.getPrestamos()) {
                System.out.println("\t" + pe);
            }
        }
    }
}
