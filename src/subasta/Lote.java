package subasta;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Lote {
    private int ID;
    private int precioSalida;
    private Set<Articulo> articulos;
    private Set<Puja> pujas;

    public Lote(int ID) {
        this.ID = ID;
        this.precioSalida = precioSalida;
        this.pujas = new HashSet<>();
        this.articulos = new HashSet<>();
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getPrecioSalida(){
        return this.articulos.stream().mapToInt(Articulo::getPrecio).sum();
    }
    public void setPrecioSalida(int precioSalida) {
        this.precioSalida = precioSalida;
    }
    public Set<Puja> getPujas() {
        return pujas;
    }
    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }
    public void addPujas(Puja pujas) {
        if (pujas.getPrecioPuja()<precioSalida){
            System.out.println("La puja es menor al precio de salida, por favor introduce otra puja:");
        } else {
            this.pujas.add(pujas);
            System.out.println("Puja de " + pujas.getPrecioPuja() + " de " + pujas.getPujador() + " añadida.");
        }
    }
    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
    public void addArticulos(Articulo articulos) {this.articulos.add(articulos);}

    @Override
    public String toString() {
        return "" + ID;
    }
}
