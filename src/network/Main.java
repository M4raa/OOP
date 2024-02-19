package network;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        //Usuarios
        Usuario mara = new Usuario("mara", "Mara");
        Usuario alex = new Usuario("alex", "Alex");
        Usuario roberto = new Usuario("roberto", "Roberto");
        usuarios.add(mara);
        usuarios.add(alex);
        usuarios.add(roberto);

        //Publicaciones de imágen
        Pimg img1 = new Pimg(mara, "15:00", 100,"toothless.png","Toothless");
        Pimg img2 = new Pimg(roberto, "16:30", 160,"manguito.gif","Manquito maracaton");
        Pimg img3 = new Pimg(alex, "01:00", 10,"buen.jpg","Buen dia");

        //Publicaciones de texto
        Ptexto text1 = new Ptexto(mara,"16:00",1250,"Publicación de texto de Mara");
        Ptexto text2 = new Ptexto(alex,"11:00",200,"Publicación de texto de Alex");
        Ptexto text3 = new Ptexto(roberto,"18:40",1000,"Publicación de texto de Roberto");

        mara.addPublicaciones(text1);
        mara.addPublicaciones(img1);
        alex.addPublicaciones(img3);
        alex.addPublicaciones(text2);
        roberto.addPublicaciones(img2);
        roberto.addPublicaciones(text3);

        //Comentar
        img1.addCom("Que guay");
        img1.addCom("Nice!");
        text2.addCom("Mola");
        img3.addCom("Fresco");

        /*for (Usuario u : usuarios){
            System.out.println(u);
            for (Publicacion p : u.getPublicaciones()){
                System.out.println("\t" + p);
                for (String s : p.getCom()){
                    System.out.println("\t\t" + s);
                }
            }
            System.out.println();
        }
        System.out.println();*/
        mara.buscarPublicaciones();


    }
}
