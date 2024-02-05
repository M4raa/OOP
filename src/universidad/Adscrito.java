package universidad;

public class Adscrito {
    private String fecha;
    private Catedra catedra;
    private Profesor profesor;

    public Adscrito(String fecha, Catedra catedra, Profesor profesor) {
        this.fecha = fecha;
        this.catedra = catedra;
        this.profesor = profesor;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Catedra getCatedra() {
        return catedra;
    }
    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    @Override
    public String toString() {
        return " [ Adscrito: " + profesor + " " + catedra + " " + fecha + " ] ";
    }
}
