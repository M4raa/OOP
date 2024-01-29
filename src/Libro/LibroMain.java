package Libro;
import java.util.ArrayList;
import java.util.List;

public class LibroMain {
    public static void main(String[] args) {
        Autor a1 = new Autor("Autor1","15/03/2000");
        Tema t= new Tema ("Juvenil");
        List<Tema> l = new ArrayList<>();
        l.add(t);
        Libro libro = new Libro("Lo que escnde la noche",a1,100,t);
        System.out.println(libro);
    }
}
