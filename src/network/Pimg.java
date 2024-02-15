package network;

public class Pimg extends Publicacion{
    private String nombreA;
    private String titulo;

    public Pimg(int id, Usuario usuario, String hora, int like, String nombreA, String titulo) {
        super(id, usuario, hora, like);
        this.nombreA = nombreA;
        this.titulo = titulo;
    }

    public String getNombreA() {
        return nombreA;
    }
    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Publicación de imágen: " + titulo;
    }
}
