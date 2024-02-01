package banco;
import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String nombre;
    private Set<Prestamo> prestamos;
    private Set<Cuenta> cuentas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.prestamos = new HashSet<>();
        this.cuentas = new HashSet<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }
    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
    public Set<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Set<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    public void addCuentas(Cuenta cuentas){
        this.cuentas.add(cuentas);
    }
    @Override
    public String toString() {
        return " [ Nombre: " + this.nombre + " ] ";
    }
}
