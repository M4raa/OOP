package maquinaExpendedora;

public class MaquinaExpendedora {
    private double cajon;
    private double ticket1;
    private double ticket2;
    private double ticket3;

    public MaquinaExpendedora(double cajon,double ticket1, double ticket2, double ticket3) {
        this.cajon = cajon;
        this.ticket1 = ticket1;
        this.ticket2 = ticket2;
        this.ticket3 = ticket3;
    }

    public double getCajon() {
        return cajon;
    }
    public void setCajon(double cajon) {
        this.cajon = cajon;
    }
    public double getTicket1() {
        return ticket1;
    }
    public void setTicket1(double ticket1) {
        this.ticket1 = ticket1;
    }
    public double getTicket2() {
        return ticket2;
    }
    public void setTicket2(double ticket2) {
        this.ticket2 = ticket2;
    }
    public double getTicket3() {
        return ticket3;
    }
    public void setTicket3(double ticket3) {
        this.ticket3 = ticket3;
    }
    @Override
    public String toString() {
        return cajon + " ";
    }
    public void pago(double dineroIntroducido, double cajon ){
        if (dineroIntroducido>cajon){
            System.out.println("Introduce cantidad exacta:");
        } else {
            System.out.println("Introduce cantidad:");
        }
    }
}
