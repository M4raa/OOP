package vehiculo;

import java.util.Set;

public class Electrico extends Vehiculo{
    private double precioW;

    public Electrico(String marca, String modelo, String color, int cv, int precio, String matricula) {
        super(marca, modelo, color, cv, precio, matricula);
        this.precioW = precioW;
    }

    public double getPrecioW() {
        return precioW;
    }

    public void setPrecioW(double precioW) {
        this.precioW = precioW;
    }
    @Override
    public String toString() {
        return "Electrico{" +
                "precioW=" + precioW +
                '}';
    }
}
