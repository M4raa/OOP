package vehiculo.gasolinera;

public class Watt extends Gasolinera{
    private double precio;

    public Watt(String gasolinera, double precio) {
        super(gasolinera);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: " + getClass() + " Precio: " + precio;
    }
}
