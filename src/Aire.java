public class Aire {
    private String nombre;
    private int min;
    private int max;
    private int temperatura;

    public Aire(String nombre, int min, int max, int temperatura){
        this.nombre = nombre;
        this.min = min;
        this.max = max;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return this.nombre + " "
        + "Min: " + this.min + " "
        + "Max: " + this.max + " "
        + "Temperatura: " + this.temperatura;
    }
    public void incrementa(){
        if ((this.temperatura+1)<=this.max){
            this.temperatura++;
        } else throw new IllegalArgumentException("La temperatura ya está al máximo");
    }
    public void decrementa(){
        if ((this.temperatura-1)>=this.min){
            this.temperatura--;
        } else throw new IllegalArgumentException("La temperatura ya está al mínimo");
    }
}
