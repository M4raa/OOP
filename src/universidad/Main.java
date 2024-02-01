package universidad;

public class Main {
    public static void main(String[] args) {
        Facultad universidad1 = new Facultad("Jaume I");
        Catedra catedra1 = new Catedra("Catedra1", universidad1);
        universidad1.addCatedras(catedra1);
        System.out.println(universidad1);
        System.out.println("\t" + catedra1);
    }
}
