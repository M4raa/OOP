package subasta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Subasta> subastas = new ArrayList<>();
        Subasta subasta1 = new Subasta("S1","14-02-2024");
        Lote lote1 = new Lote(1,1500);
        Lote lote2 = new Lote(2,2000);
        subastas.add(subasta1);
        subasta1.addLotes(lote1);
        subasta1.addLotes(lote2);
        for (Subasta s:subastas) {
            System.out.println(s);
            for (Lote l: subasta1.getLotes()) {
                System.out.println(l);
            }
        }

    }
}
