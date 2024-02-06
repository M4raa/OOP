package Biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Ejemplar {
    private int n_reg;
    private Libro libro;
    private Set<Prestamo> prestamos;
    private Set<Historico> historicos;

    public Ejemplar(int n_reg, Libro libro) {
        this.n_reg = n_reg;
        this.libro = libro;
        this.prestamos = new HashSet<>();
        this.historicos = new HashSet<>();
    }

    public int getN_reg() {
        return n_reg;
    }
    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
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
    public Set<Historico> getHistoricos() {
        return historicos;
    }
    public void setHistoricos(Set<Historico> historicos) {
        this.historicos = historicos;
    }
    @Override
    public String toString() {
        return " Ejemplar " + n_reg + " ";
    }
}
