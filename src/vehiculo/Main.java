package vehiculo;

import vehiculo.gasolinera.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Propietario> propietarios = new ArrayList<>();
        //Propietarios
        Propietario mara = new Propietario("Mara");
        Propietario maria = new Propietario("Maria");
        propietarios.add(mara);
        propietarios.add(maria);

        //Gasolineras tipo
        G98 repsol98 = new G98("Repsol");
        Watt repsolW = new Watt("Repsol");
        G95 repsol95 = new G95("Shell");

        //Coches
        Combustion coch1 = new Combustion("Mazda", "Miata", "Blanco", 230, 34000, repsol98);
        Electrico coch2 = new Electrico("Tesla", "Model S", "Negro", 310, 92000, repsolW);
        Combustion coch3 = new Combustion("Nissan", "200SX", "Rojo", 350, 60000, repsol95);

        //Add
        coch1.addPropietarios(mara);
        coch2.addPropietarios(mara);
        coch2.addPropietarios(maria);
        coch3.addPropietarios(maria);
        mara.addVehiculos(coch1);
        mara.addVehiculos(coch2);
        maria.addVehiculos(coch2);
        maria.addVehiculos(coch3);

        //Output
        repsol98.precioActual(1.56);
        repsolW.precioActual(1.24);
        repsol95.precioActual(1.43);
        for (Propietario p : propietarios){
            System.out.println(p);
            for (Vehiculo v : p.getVehiculos()){
                System.out.println("\t" + v );
                v.tipoCombustible();
                System.out.println();
            }
        }
    }
}
