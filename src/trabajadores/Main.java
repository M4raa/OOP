package trabajadores;

public class Main {
    public static void main(String[] args) {
        Directivo di = new Directivo("Pepe");
        Oficial of = new Oficial("Maria");
        Tecnico te = new Tecnico("Gonzalo");
        di.getN();
        of.getN();
        te.getN();
    }
}
