package vehiculo;

import java.util.Set;

public class Diesel extends Combustion implements Precio{
    private double precioD;

    public Diesel(String marca, String modelo, String color, int cv, int precio, String matricula, String combustible) {
        super(marca, modelo, color, cv, precio, matricula, combustible);
    }

    public double getPrecioD() {
        return precioD;
    }

    public void setPrecioD(double precioD) {
        this.precioD = precioD;
    }

    @Override
    public void precioActual(double precio) {
        this.precioD=precio;
    }

    @Override
    public String toString() {
        return "Diesel{" +
                "precioD=" + precioD +
                '}';
    }
}
