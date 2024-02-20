package vehiculo;

import java.util.HashSet;
import java.util.Set;

public class Propietario {
    private String nombre;
    private Set<Vehiculo> vehiculos;

    public Propietario(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Set<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", vehiculos=" + vehiculos +
                '}';
    }
}
