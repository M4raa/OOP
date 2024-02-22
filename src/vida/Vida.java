package vida;

public abstract class Vida{
    private String tiempoVida;
    private String nombre;

    public Vida(String tiempoVida, String nombre) {
        this.tiempoVida = tiempoVida;
        this.nombre = nombre;
    }

    public String getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(String tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " Tiempo de vida: " + getTiempoVida();
    }
}
