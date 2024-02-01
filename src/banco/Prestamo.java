package banco;

public class Prestamo {
    private int num_p;
    private int cantidad;
    private Sucursal sucursal;
    private Cliente cliente;

    public Prestamo(Sucursal sucursal, int num_p, int cantidad, Cliente cliente) {
        this.sucursal = sucursal;
        this.num_p = num_p;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
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
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString() {
        return "[ Prestamo: " + this.num_p + " ] " + this.cliente + " [ " + "Cantidad: " + this.cantidad + " ] ";
    }
}
