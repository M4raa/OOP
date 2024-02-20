package vehiculo;

import vehiculo.gasolinera.Diesel;
import vehiculo.gasolinera.G95;

public class Main {
    public static void main(String[] args) {
        Propietario mara = new Propietario("Mara");
        G95 repsol95 = new G95("Repsol",1.34);
        System.out.println(repsol95);
    }
}
