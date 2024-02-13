package zoo;

public class Main{
    public static void main(String[] args) {
        Gato api = new Gato("Api");
        api.mamar();
        api.maulla();
        api.parir();
        Perro rox = new Perro("Rox");
        rox.mamar();
        rox.ladra();
        rox.parir();
        Cocodrilo coco = new Cocodrilo("Coco");
        coco.pone();
        coco.eclosiona();
        coco.caza();
        Cacatua cata = new Cacatua("Cata");
        cata.pone();
        cata.eclosiona();
        cata.habla();

    }
}
