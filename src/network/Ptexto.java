package network;
public class Ptexto extends Publicacion{
    private String msg;

    public Ptexto(Usuario usuario, String hora, int like, String msg) {
        super(usuario, hora, like);
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
