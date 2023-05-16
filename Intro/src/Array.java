import org.w3c.dom.ls.LSOutput;

public class Array {
    public static void main(String[] args) {
        // declarare si initializare (cand stim valorile)
        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ana"};
        int[] numere = {1, 33, 31, 59, 19};
        // un array contine mai multe elemente de acelasi tip
        // intr-un array accesam elemente prin index, care incepe de la 0
        // un array are o dimensiune fixa, cea data in initializare
        // un array are proprietatea length care ne reda dimensiunea

        System.out.println(elevi[0]);
        elevi[2] = "Sebi";
        System.out.println(elevi[2]);
        System.out.println(elevi.length);
        System.out.println(elevi[elevi.length - 1]);

        // declarare si alocare de memorie
        int[] note = new int[5]; // 0, 0, 0, 0, 0
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
        System.out.println(note[1]);

    }
}
