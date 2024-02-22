package vehiculo;
import vehiculo.gasolinera.Gasolinera;
public class Electrico extends Vehiculo{
    public Electrico(String marca, String modelo, String color, int cv, int precio, Gasolinera tipo) {
        super(marca, modelo, color, cv, precio, tipo);
    }
    @Override
    public void tipoCombustible() {
        System.out.println("\t\t" + getTipo());
    }
}
