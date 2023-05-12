package esercitazioni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main{


    public static void main(String[] args) {
        HashMap<String,Float> mappa=new HashMap<>();
        List<Workman>    workmen= new ArrayList<>();
        workmen.add(new Workman("Mario Gialli", 0, 0.5f, 20));
        workmen.add(new Workman("Gianni Fannulloni", 5, 0.2f, 30));
        workmen.add(new Workman("Giorgia Lavoroni",17 , 0.85f, 40));

        List<Head> heads = new ArrayList<>();
        heads.add(new Head("Alessio Antichi", 3, 0.55f, 20));
        heads.add(new Head("Marianna Figlidelcapo", 1, 0.3f, 2));
        heads.add(new Head("Gianluigi Figlidelcapo",9 , 0.3f, 4));

        System.out.println("promossi:");
        for (Workman w : workmen) {
            mappa.put(w.getNome(), w.getEfficencyIndex());
            if (w.canApplyForPromotion()) {
                System.out.println(w.getNome());
            }
        }
        System.out.println("declassati:");
        for (Head h : heads) {
            mappa.put(h.getNome(), h.getEfficencyIndex());
            if (h.mayBeDemoted()) {
                System.out.println(h.getNome());
            }
        }
        System.out.println(mappa);
    }
}
