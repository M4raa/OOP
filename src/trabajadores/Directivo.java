package trabajadores;

public class Directivo extends Empleado implements nombre{
    public Directivo(String nombre) {
        super(nombre);
    }
    @Override
    public void getN(){
        System.out.println(getNombre());
    }
}
