package Banco;

public class Prestamo {
    private Sucursal sucursal;
    private Cliente cliente;
    private int num_p;
    private int cantidad;

    public Prestamo(Sucursal sucursal, Cliente cliente, int num_p, int cantidad) {
        this.sucursal = sucursal;
        this.cliente = cliente;
        this.num_p = num_p;
        this.cantidad = cantidad;
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

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Prestamo: " + this.num_p
                + " Cantidad: " + this.cantidad
                + " Sucursal: " + this.sucursal
                + " Cliente: " + this.cliente;
    }
}
