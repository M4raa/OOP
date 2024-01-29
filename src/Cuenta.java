public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }
    Cuenta(String titular,int cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "  Cantidad: " + cantidad;
    }
    public void ingresar(double cantidadi){
        if (cantidadi>0){
            this.cantidad+=cantidadi;
        } else throw new IllegalArgumentException("No se hará ningun cambio.");
    }
    public void retirar(double cantidadr){
        if (this.cantidad-cantidadr<0){
            this.cantidad=0;
        }else this.cantidad-=cantidadr;
    }
}