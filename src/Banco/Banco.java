package Banco;

import java.util.Set;

public class Banco {
    private int n_ent;
    private String nombre;
    private Set<Sucursal> sucursales;

    public Banco(int n_ent, String nombre, Set<Sucursal> sucursales) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        this.sucursales = sucursales;
    }

    public int getN_ent() {
        return n_ent;
    }

    public void setN_ent(int n_ent) {
        this.n_ent = n_ent;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addSucursales(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    @Override
    public String toString() {
        return  "Id: " + n_ent + " Banco: " + nombre;
    }
}
