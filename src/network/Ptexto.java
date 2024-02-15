package network;

public class Ptexto extends Publicacion{
    private String msg;

    public Ptexto(int id, Usuario usuario, String hora, int like, String msg) {
        super(id, usuario, hora, like);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Publicación de texto: " + msg;
    }
}
