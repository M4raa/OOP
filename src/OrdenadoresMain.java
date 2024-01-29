import java.util.ArrayList;

public class OrdenadoresMain {
    public static void main(String[] args) {
        Ordenadores  o1= new Ordenadores("Asus","i5-10500H", "rtx2070", 16, 500, 1050.50);
        Ordenadores  o2= new Ordenadores("Dell","i3-9400KS", "rtx3060", 16, 1000, 1400.20);
        Ordenadores  o3= new Ordenadores("MSI","i9-13900KF", "rtx4090", 32, 2000, 1840.00);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
}
