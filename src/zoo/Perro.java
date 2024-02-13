package zoo;

public class Perro extends Mamifero{
    public Perro(String nombre) {
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

    public void ladra(){
        System.out.println("El perro ladra");
    }
}
