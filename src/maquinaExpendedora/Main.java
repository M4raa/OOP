package maquinaExpendedora;

public class Main {
    public static void main(String[] args) {
        double cajon=10;
        double ticket1=0.5;
        double ticket2=1.5;
        double ticket3=2;
        double dineroIntroducido=20;
        MaquinaExpendedora maquina1=new MaquinaExpendedora(10,ticket1,ticket2,ticket3);
        maquina1.pago(dineroIntroducido,cajon);


    }
}
