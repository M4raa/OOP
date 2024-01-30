package Banco;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Cliente Yo = new Cliente("26600625K");
        Banco bbva = new Banco(1,"BBVA", new HashSet<>());
            Sucursal sMayor = new Sucursal(bbva,01,"C/ Mayor",new HashSet<>());
            Sucursal sEnMedio = new Sucursal(bbva,02,"C/En Medio", new HashSet<>());
        bbva.addSucursales(sMayor);
        bbva.addSucursales(sEnMedio);
        System.out.println(bbva);
        for (Sucursal s:bbva.getSucursales()) {
            System.out.println("\"" + s);
        }
        Prestamo pBBVA = new Prestamo(sMayor,Yo,0001,1500);

    }
}
