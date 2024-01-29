

public class AireMain {
    public static void main(String[] args) {
        Aire a1 = new Aire("Hitachi", 15,30, 26);
        Aire a2 = new Aire("Fujitsu", 13,32, 23);
        Aire a3 = new Aire("Daikin", 16,30,29);
        Aire a4 = new Aire("Panasonic", 11,34, 33);
        a1.decrementa();
        a1.decrementa();
        a1.decrementa();
        a3.incrementa();
        a4.decrementa();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
