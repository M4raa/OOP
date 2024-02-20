package vehiculo;

import vehiculo.gasolinera.Gasolinera;

import java.util.Set;

public abstract class Combustion extends Vehiculo{
    private Set<Gasolinera> gasolineras;

    public Combustion(String marca, String modelo, String color, int cv, int precio, String matricula, String combustible) {
        super(marca, modelo, color, cv, precio, matricula);
        this.combustible = combustible;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

}
