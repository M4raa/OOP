package network;

import java.util.HashSet;
import java.util.Set;

public class Usuario implements Interfaz{
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
    public void buscarPublicaciones(){
        System.out.println(getUsuario() + ": ");
        for (Publicacion p : getPublicaciones()) {
            System.out.println(
                    "\t ID: " + p.getId() +
                    "\t Hora de publicación: " + p.getMt() +
                    "\t Likes: " + p.getLike() +
                    "\n\t Comentarios: " + p.getCom());
            System.out.println();

        }
    }

    @Override
    public String toString() {
        return "Usuario: " + "\"" + usuario + "\"" +
                " Nombre: " + nombre;
    }
}
