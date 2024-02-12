package subasta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Subasta> subastas = new ArrayList<>();
        Subasta subasta1 = new Subasta("S1","14-02-2024");
        Lote lote1 = new Lote(1);
        Lote lote2 = new Lote(2);
        Articulo articulo1 = new Articulo("A1", 1000, lote1);
        Articulo articulo2 = new Articulo("A2", 100, lote1);
        Articulo articulo3 = new Articulo("A3", 200, lote1);
        Articulo articulo4 = new Articulo("A4", 400, lote2);
        Articulo articulo5 = new Articulo("A5", 2000, lote2);
        Pujador p1 = new Pujador("P1");
        Pujador p2 = new Pujador("P2");
        Puja pj1 = new Puja(1100, p1, lote1);
        Puja pj2 = new Puja(1500, p1, lote1);
        Puja pj3 = new Puja(1600, p2, lote1);
        Puja pj4 = new Puja(1800, p1, lote1);
        lote1.addArticulos(articulo1);
        lote1.addArticulos(articulo2);
        lote1.addArticulos(articulo3);
        lote2.addArticulos(articulo4);
        lote2.addArticulos(articulo5);
        subastas.add(subasta1);
        subasta1.addLotes(lote1);
        subasta1.addLotes(lote2);
        p1.addPujas(pj1);
        p1.addPujas(pj2);
        p2.addPujas(pj3);
        p1.addPujas(pj4);
        System.out.println(subasta1);
        System.out.println("\tLote: " + lote1 + " Precio de Salida: " + lote1.getPrecioSalida());
        for (Articulo a:lote1.getArticulos()) {
            System.out.println("\t\t" + a);
        }

        lote1.addPujas(pj1);
        lote1.addPujas(pj2);
        lote1.addPujas(pj3);
        lote1.addPujas(pj4);
        subasta1.cerrarSubasta();


    }
}
