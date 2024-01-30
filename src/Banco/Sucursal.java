package Banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int n_suc;
    private String dir;
    private Banco banco;
    private Set<Prestamo> prestamos;

    public Sucursal(Banco banco, int n_suc, String dir, Set<Prestamo> prestamos) {
        this.banco = banco;
        this.n_suc = n_suc;
        this.dir = dir;
        this.prestamos = new HashSet<>();
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamos(Prestamo prestamos) {
        this.prestamos.add(prestamos);
    }

    @Override
    public String toString() {
        return "Sucursal: " + n_suc +
                " Dirección: " + dir;
    }
}
