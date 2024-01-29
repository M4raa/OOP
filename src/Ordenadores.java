public class Ordenadores {
    private String marca;
    private String cpu;
    private String gpu;
    private int ram;
    private int almacenamiento;
    private double precio;

    public Ordenadores(String marca, String cpu, String gpu, int ram, int almacenamiento, double precio){
        this.marca = marca;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return marca + " " +
                cpu + " " +
                gpu + " " +
                ram + "Gb " +
                almacenamiento + "Gb " +
                precio + "€";
    }
}

