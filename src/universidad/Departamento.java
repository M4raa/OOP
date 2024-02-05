package universidad;

import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String nombre;
    private Area area;
    private Set<Catedra> catedra;
    private Set<Profesor> profesores;

    public Departamento(String nombre, Area area) {
        this.nombre = nombre;
        this.area = area;
        this.catedra = new HashSet<>();
        this.profesores = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Catedra> getCatedra() {
        return catedra;
    }
    public void setCatedra(Set<Catedra> catedra) {
        this.catedra = catedra;
    }
    public void addCatedra(Catedra catedra) {
        this.catedra.add(catedra);
    }
    public Set<Profesor> getProfesor() {
        return profesores;
    }
    public void setProfesor(Set<Profesor> profesores) {
        this.profesores = profesores;
    }
    public void addProfesor(Profesor profesores) {
        this.profesores.add(profesores);
    }
    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return " [ Departamento: " + nombre + " ] ";
    }
}
