package network;

public class Main {
    public static void main(String[] args) {
        Usuario mara = new Usuario("mara", "Mara");
        Pimg img1 = new Pimg(1,mara, "15:00", 100,"toothless.png","Toothless");
        mara.addPublicaciones(img1);
        System.out.println(mara);
        System.out.println("\t" + mara.getPublicaciones());
    }
}
