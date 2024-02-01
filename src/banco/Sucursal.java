package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int n_suc;
    private String dir;
    private Banco banco;
    private Set<Prestamo> prestamos;
    private Set<Cliente> clientes;
    private Set<Cuenta> cuentas;

    public Sucursal(Banco banco, int n_suc, String dir) {
        this.banco = banco;
        this.n_suc = n_suc;
        this.dir = dir;
        this.prestamos = new HashSet<>();
        this.clientes = new HashSet<>();
        this.cuentas = new HashSet<>();
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
    public void addPrestamos(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public Set<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void addClientes(Cliente clientes) {
        this.clientes.add(clientes);
    }
    public Set<Cuenta> getCuentas() {
        return cuentas;
    }
    public void setCuentas(Set<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    public void addCuentas(Cuenta cuentas) {
        this.cuentas.add(cuentas);
    }

    @Override
    public String toString() {
        return " [ Sucursal: " + n_suc + " ] " + " [ Dirección: " + dir + " ] ";
    }
}
