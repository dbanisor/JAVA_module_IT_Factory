import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // listele: au o dimensiune dinamica

        // adaugam elemente
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se redau elementele
        System.out.println(fructe.get(0));

        // cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));

        // este lista goala?
        System.out.println(fructe.isEmpty());

        // eliminam toate elementele din lista
//        fructe.clear();

        // scoatem un element
        fructe.remove("mar");

        // listam elementele
        System.out.println(fructe);

        if (!fructe.isEmpty()) {
            System.out.println("Nu e nevoie de cumparaturi");
        } else {
            System.out.println("E nevoie de cumparaturi");
        }

        // declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        // listam elementele
        System.out.println(fructe);

        // declaram o lista dinamica si o initializam cu valori
        String[] flowers = {"orhidee", "crizantema", "lalea", "margareta"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("trandafir");
        System.out.println(flowerList);

        // aflam pozitia lui "crizantema"
        int crizantema_index = flowerList.indexOf("crizantema");
        System.out.println(crizantema_index);
        // stergem un index
        flowerList.remove(crizantema_index);
        System.out.println(flowerList);

    }
}
