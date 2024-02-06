package Biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String dni;
    private Set<Prestamo> prestamos;

    public Lector(String dni) {
        this.dni = dni;
        this.prestamos = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void addPrestamos(Prestamo prestamos) {
        this.prestamos.add(prestamos);
    }
    @Override
    public String toString() {
                return " " + dni + " ";
    }
}
