package zoo;

public class Cacatua extends NoMamifero{
    public Cacatua(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void pone() {
        super.pone();
    }

    @Override
    public void eclosiona() {
        super.eclosiona();
    }

    public void habla() {
        System.out.println("La cacatua habla");
    }
}
