package vehiculo.gasolinera;

public class G95 extends Gasolinera{
    private double precio;

    public G95(String gasolinera) {
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
