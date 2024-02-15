package network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Publicacion {
    private int id;
    private Usuario usuario;
    private String hora;
    private int like;
    private Set<String> com;

    public Publicacion(int id, Usuario usuario, String hora, int like) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Publicacion: " +
                "ID: " + id +
                " Usuario: " + usuario +
                " Hora: " +hora +
                " Likes: " + like +
                " Comentarios" + com;
    }
}
