package universidad;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private String nombre;
    private Departamento departamento;
    private Set<Catedra> catedras;
    private Set<Adscrito> adscrito;

    public Profesor(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.catedras = new HashSet<>();
        this.adscrito = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Set<Catedra> getCatedras() {
        return catedras;
    }
    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }
    public void addCatedras(Catedra catedras) {
        this.catedras.add(catedras);
    }
    public Set<Adscrito> getAdscrito() {
        return adscrito;
    }
    public void setAdscrito(Set<Adscrito> adscrito) {
        this.adscrito = adscrito;
    }
    public void addAdscrito(Adscrito adscrito) {
        this.adscrito.add(adscrito);
    }
    @Override
    public String toString() {
        return " [ " + nombre + " ] ";
    }
}
