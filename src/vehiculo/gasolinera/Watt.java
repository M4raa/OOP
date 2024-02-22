package vehiculo.gasolinera;

public class Watt extends Gasolinera{
    private double precio;

    public Watt(String gasolinera) {
        super(gasolinera);
        this.precio = 0;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void precioActual(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return super.toString() + " Precio: " + precio + "€";
    }
}
