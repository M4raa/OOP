package universidad;

import java.util.HashSet;
import java.util.Set;

public class Area {
    private String nombre;
    private Set<Departamento> departamentos;

    public Area(String nombre) {
        this.nombre = nombre;
        this.departamentos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    @Override
    public String toString() {
        return " [ Area: " + nombre + " ] ";
    }
}
