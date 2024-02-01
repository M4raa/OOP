package banco;

public class Domiciliacion {
    private Cuenta cuenta;
    private int num_d;

    public Domiciliacion(Cuenta cuenta, int num_d) {
        this.cuenta = cuenta;
        this.num_d = num_d;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    @Override
    public String toString() {
        return "Cuenta: " + cuenta +
                " Domiciliación: " + num_d;
    }
}
