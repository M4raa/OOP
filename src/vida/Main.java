package vida;

public class Main {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("5 años", "Bos Taurus");
        Rosa rosa = new Rosa("2 meses", "Plantatio Rosa");
        Naranjo naranjo = new Naranjo("6 años", "Citrus Sintesis");
        vaca.produceAlimento();
        naranjo.produceAlimento();
    }
}
