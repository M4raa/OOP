package banco;

import java.util.HashSet;
import java.util.Set;

public class Cuenta {
    private int n_cc;
    private Sucursal sucursal;
    private Set<Cliente> clientes;

    public Cuenta(int n_cc, Sucursal sucursal, Cliente cliente) {
        this.n_cc = n_cc;
        this.sucursal = sucursal;
        this.clientes = new HashSet<>();
    }

    public int getN_cc() {
        return n_cc;
    }
    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }
    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public Set<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void addCliente(Cliente clientes) {
        this.clientes.add(clientes);
    }


    @Override
    public String toString() {
        return " [ Nºcuenta: " + " " + n_cc + " ] ";
    }
}
