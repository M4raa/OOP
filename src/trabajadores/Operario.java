package trabajadores;

public abstract class Operario extends Empleado implements nombre{

    public Operario(String nombre) {
        super(nombre);
    }
    @Override
    public void getN(){
        System.out.println(getNombre());
    }
}
