package vehiculo;
import vehiculo.gasolinera.Gasolinera;
public class Combustion extends Vehiculo{
    public Combustion(String marca, String modelo, String color, int cv, int precio, Gasolinera tipo) {
        super(marca, modelo, color, cv, precio, tipo);
    }

    @Override
    public void tipoCombustible() {
        System.out.println("\t\t" + getTipo());
    }
}
