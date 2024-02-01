package universidad;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private String nombre;
    private Set<Catedra> catedras;
    private Set<Departamento> departamentos;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.catedras = new HashSet<>();
        this.departamentos = new HashSet<>();
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

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}
