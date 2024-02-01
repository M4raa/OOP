package banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private int n_ent;
    private String nombre;
    private Set<Sucursal> sucursales;
    private Set<Prestamo> prestamos;
    private Set<Cliente> clientes;

    public Banco(int n_ent, String nombre, Set<Sucursal> sucursales) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        this.sucursales = sucursales;
        this.prestamos = new HashSet<>();
        this.clientes = new HashSet<>();
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
    public Set<Sucursal> getSucursales() {
        return sucursales;
    }
    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    public void addSucursales(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }
    public void setPrestamos(Set<Prestamo> prestamo) {
        this.prestamos = prestamo;
    }
    public void addPrestamos(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public Set<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void addClientes(Cliente clientes) {
        this.clientes.add(clientes);
    }

    @Override
    public String toString() {
        return  "[ Banco:" + " " + nombre + " ]";
    }
}
