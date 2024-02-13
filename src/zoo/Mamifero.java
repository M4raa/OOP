package zoo;

public abstract class Mamifero extends Animales{
    public Mamifero(String nombre) {
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

    public void parir(){
        System.out.println("El mamífero pare");
    }
    public void mamar(){
        System.out.println("El mamífero mama");
    }

}
