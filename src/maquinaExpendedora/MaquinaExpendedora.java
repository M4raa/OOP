package maquinaExpendedora;

import java.util.HashMap;

public class MaquinaExpendedora {
    private int cajon;
    private int ticket1;

    public MaquinaExpendedora(int cajon,int ticket1) {
        this.cajon = cajon;
        this.ticket1 = ticket1;
    }

    public int getCajon() {
        return cajon;
    }
    public void setCajon(int cajon) {
        this.cajon = cajon;
    }
    public int getTicket1() {
        return ticket1;
    }
    public void setTicket1(int ticket1) {
        this.ticket1 = ticket1;
    }
    @Override
    public String toString() {
        return cajon + " ";
    }
    public void pago(int dineroIntroducido,int ticket1 ,int cajon ){
        int[] dinero={10000,5000,2000,1000,500,200,100,50,20,10,5,2,1};
        HashMap<Integer,String> dineroCajon = new HashMap<>();
            dineroCajon.put(1,"0,01€");
            dineroCajon.put(2,"0,02€");
            dineroCajon.put(5,"0,05€");
            dineroCajon.put(10,"0,1€");
            dineroCajon.put(20,"0,2€");
            dineroCajon.put(50,"0,5€");
            dineroCajon.put(100,"1€");
            dineroCajon.put(200,"2€");
            dineroCajon.put(500,"5€");
            dineroCajon.put(1000,"10€");
            dineroCajon.put(2000,"20€");
            dineroCajon.put(5000,"50€");
            dineroCajon.put(10000,"100€");
        if ((dineroIntroducido-ticket1)>cajon){
            System.out.println("Introduce cantidad exacta:");
        } else if (dineroIntroducido<ticket1) {
            System.out.println("Falta dinero");
        } else {
            String devolucion="";
            int dev=dineroIntroducido-ticket1;
            System.out.println("Devolviendo... ");
            for (int i = 0; i < dinero.length; i++) {
                int x=dev%dinero[i];
                int y=dev/dinero[i];
                if (y>=1){
                    dev=dev-(dinero[i]*y);
                    for (int j = 0; j < y; j++) {
                        devolucion+=(dineroCajon.get(dinero[i]) + " ");
                    }
                }
            }
            System.out.println(devolucion);
        }
    }
}
