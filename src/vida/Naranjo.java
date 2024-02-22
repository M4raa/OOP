package vida;

public class Naranjo extends Vegetal implements Produce{
    public Naranjo(String tiempoVida, String nombre) {
        super(tiempoVida, nombre);
    }
    @Override
    public void produceAlimento() {
        System.out.println("El naranjo produce naranjas");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
