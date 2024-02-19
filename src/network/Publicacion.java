package network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Publicacion{
    private static int c=1;
    private int id;
    private Usuario usuario;
    private String hora;
    private int like;
    private Set<String> com;

    public Publicacion(Usuario usuario, String hora, int like) {
        this.id = c++;
        this.usuario = usuario;
        this.hora = hora;
        this.like = like;
        this.com = new HashSet<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getMt() {
        return hora;
    }
    public void setMt(String hora) {
        this.hora = hora;
    }
    public int getLike() {
        return like;
    }
    public void setLike(int like) {
        this.like = like;
    }
    public Set<String> getCom() {
        return com;
    }
    public void setCom(Set<String> com) {
        this.com = com;
    }
    public void addCom(String com) {
        this.com.add(com);
    }
}
