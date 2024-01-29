public class CuentaMain {
    public static void main(String[] args) {
     Cuenta c1 = new Cuenta("Maria", 1020);
     Cuenta c2 = new Cuenta("Juan", 12);
     Cuenta c3 = new Cuenta("Pepe");
     Cuenta c4 = new Cuenta("Ernesto", 10);
        c1.ingresar(10);
        c2.retirar(13);
        c3.retirar(10);
        c4.ingresar(1000);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
