package universidad;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String nombre;
    private Facultad facultad;
    private Set<Departamento> departamentos;
    private Set<Profesor> profesores;

    public Catedra(String nombre, Facultad facultad) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.departamentos = new HashSet<>();
        this.profesores = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Facultad getFacultad() {
        return facultad;
    }
    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    public Set<Profesor> getProfesores() {
        return profesores;
    }
    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return " [ Catedra: " + nombre + " ] ";
    }
}
