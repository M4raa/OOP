package vehiculo;

import java.util.HashSet;
import java.util.Set;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int cv;
    private int precio;
    private String matricula;
    private Set<Propietario> propietarios;

    public Vehiculo(String marca, String modelo, String color, int cv, int precio, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cv = cv;
        this.precio = precio;
        this.matricula = matricula;
        this.propietarios = new HashSet<>();
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Set<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Set<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

}
