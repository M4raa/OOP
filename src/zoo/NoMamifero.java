package zoo;

abstract class NoMamifero extends Animales{
    public NoMamifero(String nombre) {
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

    public void pone(){System.out.println("El animal pone un huevo");}
    public void eclosiona(){
        System.out.println("El animal eclosiona");
    }

}