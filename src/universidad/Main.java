package universidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Facultad> facultades = new ArrayList<>();
        ArrayList<Area> areas= new ArrayList<>();

       Facultad f1 = new Facultad("Jaume I");

       Area ciencia = new Area("CIENCIAS");
       Area lengua = new Area("LENGUAS");

       Departamento medicina = new Departamento("Medicina",ciencia);
       Departamento edl = new Departamento("Estudio de lenguas",lengua);

       Catedra pf = new Catedra("Preparación de quirófano",f1,medicina);
       Catedra hl = new Catedra("Historia de la lengua",f1,edl);
       Catedra lm = new Catedra("Lenguaje de Medicina",f1,edl);

       Profesor miguel = new Profesor("Miguel",medicina);
       Profesor maria = new Profesor("Maria",edl);

       Adscrito adscrito1 = new Adscrito("15-10-2015",pf,miguel);
       Adscrito adscrito2 = new Adscrito("17-12-2017",lm,miguel);
       Adscrito adscrito3 = new Adscrito("08-03-2016",hl,maria);
       //Arrays
       facultades.add(f1);
       areas.add(ciencia);
       areas.add(lengua);
       //Areas
       ciencia.addDepartamentos(medicina);
       lengua.addDepartamentos(edl);

       //Departamentos
       medicina.addCatedra(pf);
       medicina.addProfesor(miguel);
       edl.addCatedra(hl);
       edl.addProfesor(miguel);
       edl.addProfesor(maria);

       //Adscritos
        miguel.addAdscrito(adscrito1);
        miguel.addAdscrito(adscrito2);
        maria.addAdscrito(adscrito3);

        //Catedras
        pf.addProfesores(miguel);
        hl.addProfesores(maria);
        lm.addProfesores(miguel);

        //Profesores
        maria.addCatedras(hl);
        miguel.addCatedras(pf);
        miguel.addCatedras(lm);

        for (Facultad f:facultades) {
            System.out.println(f);
            for (Area a:areas) {
                System.out.println("\t" + a);
                for (Departamento d:a.getDepartamentos()) {
                    System.out.println("\t\t" + d);
                    for (Profesor p:d.getProfesor()) {
                        System.out.println("\t\t\t" + p);
                        for (Catedra c:d.getCatedra()) {
                            System.out.println("\t\t\t\t" + c);
                        }
                    }

                }
            }
        }


    }
}
