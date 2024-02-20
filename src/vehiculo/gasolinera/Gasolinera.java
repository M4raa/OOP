package vehiculo.gasolinera;

public abstract class Gasolinera {
    private String gasolinera;

    public Gasolinera(String gasolinera) {
        this.gasolinera = gasolinera;
    }

    public String getGasolinera() {
        return gasolinera;
    }
    public void setGasolinera(String gasolinera) {
        this.gasolinera = gasolinera;
    }

    @Override
    public String toString() {
        return "Gasolinera: " + gasolinera;
    }
}
