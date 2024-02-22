package vehiculo;

import vehiculo.gasolinera.Gasolinera;
import java.util.HashSet;
import java.util.Set;

public abstract class Vehiculo implements Tipo {
    private String marca;
    private String modelo;
    private String color;
    private int cv;
    private int precio;
    private Set<Propietario> propietarios;
    private Gasolinera tipo;

    public Vehiculo(String marca, String modelo, String color, int cv, int precio, Gasolinera tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cv = cv;
        this.precio = precio;
        this.propietarios = new HashSet<>();
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCv() {
        return cv;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Set<Propietario> getPropietarios() {
        return propietarios;
    }
    public void setPropietarios(Set<Propietario> propietarios) {
        this.propietarios = propietarios;
    }
    public void addPropietarios(Propietario propietarios) {
        this.propietarios.add(propietarios);
    }
    public Gasolinera getTipo() {
        return tipo;
    }
    public void setTipo(Gasolinera tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return  " Marca: " + marca +
                " - Modelo: " + modelo +
                " - Color: " + color +
                " - CV: " + cv +
                " - Precio: " + precio + "€";
    }
}
