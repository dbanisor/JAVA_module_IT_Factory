import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // un map este o reprezentare de date in sistem cheie valoare
        // exemplu: Gigel are nota 10 , Costel are nota 9

        // declaram un map
        HashMap<String, Integer> note_elevi = new HashMap<String, Integer>();

         // adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        // aflu notele
        System.out.println("Ana a luat nota: " + note_elevi.get("Ana"));

        // actualizam valori
        note_elevi.replace("Costel", 8);
        System.out.println(note_elevi);

        // aflam dimensiunea
        System.out.println(note_elevi.size());

        // stergem elemente
        note_elevi.remove("Gigel");
        System.out.println(note_elevi);

        // declaram si initializam cu valori
        Map<String, Integer> luni = new HashMap<String, Integer>() {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }};
        System.out.println(luni.values());
        System.out.println(luni.keySet());


    }
}
