package Banco;

public class Cuenta {
    private int n_cc;
    private Sucursal sucursal;
    private Cliente cliente;

    public Cuenta(int n_cc, Sucursal sucursal, Cliente cliente) {
        this.n_cc = n_cc;
        this.sucursal = sucursal;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Numero de cuenta: " + n_cc +
                " Sucursal " + sucursal +
                " Cliente " + cliente;
    }
}
