package network;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String usuario;
    private String nombre;
    private Set<Publicacion> publicaciones;

    public Usuario(String usuario, String nombre) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.publicaciones = new HashSet<>();
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Publicacion> getPublicaciones() {
        return publicaciones;
    }
    public void setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    public void addPublicaciones(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }

    @Override
    public String toString() {
        return "Usuario: " + "< " + usuario + " >" +
                " Nombre: " + nombre;
    }
}
