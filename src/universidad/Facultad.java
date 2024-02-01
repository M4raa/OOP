package universidad;

import java.util.HashSet;
import java.util.Set;

public class Facultad {
    private String nombre;
    private Set<Catedra> catedras;
    private Set<Departamento> departamentos;
    private Set<Profesor> profesores;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.catedras = new HashSet<>();
        this.departamentos = new HashSet<>();
        this.profesores = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    public void addDepartamentos(Departamento departamentos) {
        this.departamentos.add(departamentos);
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
        return " [ Facultad : " + nombre + " ] ";
    }
}

