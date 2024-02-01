package universidad;

import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String nombre;
    private Catedra catedra;
    private Profesor profesor;
    private Set<Area> areas;

    public Departamento(String nombre,Catedra catedra, Profesor profesor) {
        this.nombre = nombre;
        this.catedra = catedra;
        this.profesor = profesor;
        this.areas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Set<Area> getAreas() {
        return areas;
    }

    public void setAreas(Set<Area> areas) {
        this.areas = areas;
    }
    public void addAreas(Area areas) {
        this.areas.add(areas);
    }

    @Override
    public String toString() {
        return " [ Departamento: " + nombre + " ] ";
    }
}
