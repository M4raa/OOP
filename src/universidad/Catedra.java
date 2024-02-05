package universidad;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String nombre;
    private Facultad facultad;
    private Departamento departamento;
    private Set<Profesor> profesores;

    public Catedra(String nombre, Facultad facultad, Departamento departamento) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.departamento = departamento;
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
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Set<Profesor> getProfesores() {
        return profesores;
    }
    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }
    public void addProfesores(Profesor profesores) {
        this.profesores.add(profesores);
    }
    @Override
    public String toString() {
        return " [ " + nombre + " ] ";
    }
}
