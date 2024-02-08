package subasta;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private int ID;
    private int precioSalida;
    private Set<Articulo> articulos;

    public Lote(int ID, int precioSalida) {
        this.ID = ID;
        this.precioSalida = precioSalida;
        this.articulos = new HashSet<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrecioSalida() {
        return precioSalida;
    }

    public void setPrecioSalida(int precioSalida) {
        this.precioSalida = precioSalida;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Lote: " + ID + " - Precio de Salida: " + precioSalida + "\n Articulos: " + articulos;
    }
}
