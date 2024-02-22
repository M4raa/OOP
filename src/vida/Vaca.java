package vida;

public class Vaca extends Animal implements Produce{
    public Vaca(String tiempoVida, String nombre) {
        super(tiempoVida, nombre);
    }
    @Override
    public void produceAlimento() {
        System.out.println("La vaca produce leche");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
