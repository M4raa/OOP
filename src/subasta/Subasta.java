package subasta;

public class Subasta {
    private int id;
    private int dia;

    public Subasta(int id, int dia) {
        this.id = id;
        this.dia = dia;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "ID= " + id + " Dia:" + dia;
    }
    public void cerrarSubasta(){

    }
}
