package zoo;

public class Gato extends Mamifero{
    public Gato(String nombre) {
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
    public void parir() {
        super.parir();
    }

    @Override
    public void mamar() {
        super.mamar();
    }

    public void maulla(){
        System.out.println("El gato maulla");
    }
}
