package subasta;

public class Puja {
    private int precioPuja;
    private Pujador pujador;
    private Lote lote;

    public Puja(int precioPuja, Pujador pujador, Lote lote) {
        this.precioPuja = precioPuja;
        this.pujador = pujador;
        this.lote = lote;
    }

    public int getPrecioPuja() {
        return precioPuja;
    }

    public void setPrecioPuja(int precioPuja) {
        this.precioPuja = precioPuja;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Puja: " + precioPuja + pujador + lote;
    }
}
