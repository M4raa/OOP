package Libro;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private Tema tema;

    public Libro(String titulo, Autor autor, int paginas, Tema tema) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro: " + this.titulo + this.autor + this.paginas + this.tema;
    }
}
