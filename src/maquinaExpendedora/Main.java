package maquinaExpendedora;

public class Main {
    public static void main(String[] args) {
        int cajon=2000;
        int ticket1=50;
        int dineroIntroducido=500;
        MaquinaExpendedora maquina1=new MaquinaExpendedora(cajon,ticket1);
        maquina1.pago(dineroIntroducido,ticket1,cajon);


    }
}
