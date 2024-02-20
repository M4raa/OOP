package vehiculo;

import java.util.Set;

public class Gasolina extends Combustion implements Precio{
    private double precio95;

    public Gasolina(String marca, String modelo, String color, int cv, int precio, String matricula, String combustible) {
        super(marca, modelo, color, cv, precio, matricula, combustible);
    }

    public double getPrecio95() {
        return precio95;
    }

    public void setPrecio95(double precio95) {
        this.precio95 = precio95;
    }

    @Override
    public void precioActual(double precio) {
        this.precio95=precio;
    }

    @Override
    public String toString() {
        return "Gasolina{" +
                "precio95=" + precio95 +
                '}';
    }
}
