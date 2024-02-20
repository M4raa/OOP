package vehiculo.gasolinera;

public class G98 extends Gasolinera{
    private double precio;

    public G98(String gasolinera, double precio) {
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