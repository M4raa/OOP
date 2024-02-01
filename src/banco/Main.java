package banco;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Banco> bancos = new ArrayList<>();
        Banco bbva = new Banco(1,"BBVA", new HashSet<>());
            Sucursal sMayor = new Sucursal(bbva,1,"C/ Mayor");
            Sucursal sEnMedio = new Sucursal(bbva,2,"C/En Medio");
            bbva.addSucursales(sMayor);
            bbva.addSucursales(sEnMedio);
        bancos.add(bbva);
        Cliente david = new Cliente("David");
        Prestamo p1BBVA = new Prestamo(sMayor,1,1500, david);
        Cuenta ccdavid = new Cuenta(1,sMayor,david);
        sMayor.addCuentas(ccdavid);
        david.addCuentas(ccdavid);
        david.addPrestamo(p1BBVA);
        sMayor.addPrestamos(p1BBVA);
        sMayor.addClientes(david);

        Cliente alex = new Cliente("Alex");
        Prestamo p2BBVA = new Prestamo(sEnMedio,2,1000, alex);
        Cuenta ccalex = new Cuenta(2,sEnMedio,alex);
        sMayor.addCuentas(ccalex);
        alex.addCuentas(ccalex);
        alex.addPrestamo(p2BBVA);
        sEnMedio.addClientes(alex);
        sEnMedio.addPrestamos(p2BBVA);
        for (Banco b:bancos) {
            System.out.println(b);
            for (Sucursal s : b.getSucursales()) {
                System.out.println("\t" + s);
                for (Cliente c: s.getClientes()) {
                    System.out.println("\t\t" + c);
                    for (Cuenta cc: c.getCuentas()) {
                        System.out.println("\t\t\t" + cc);
                    }
                }
            }
        }
    }
}
