package Biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Prestamo {
    private String fecha;
    private Set<Ejemplar> ejemplares;
    private Lector lector;

    public Prestamo(String fecha, Lector lector) {
        this.fecha = fecha;
        this.ejemplares = new HashSet<>();
        this.lector = lector;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }
    public void addEjemplares(Ejemplar ejemplares) {
        this.ejemplares.add(ejemplares);
    }
    public Lector getLector() {
        return lector;
    }
    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return ejemplares + " " + lector + " " + fecha;
    }
}
