public class For {
    public static void main(String[] args) {
        // de unde incepem?
        // pana unde mergem?
        // pasul de parcurgere

        // problema: printam 101 dalmatieni
        for (int i = 1; i <= 101; i++) {
            System.out.println(" Dalmatianul cu nr " + i);
        }

        // ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 10, 20, 30};
        for (int i = 0; i < numere.length; i++) {
            System.out.println(" Elementul are index " + i + " si valoarea " + numere[i]);
        }

        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere) {
            System.out.println("Nr este : " + numar);
        }

        // parcurgem array de culori
        String[] culori = {"rosu", "alb", "verde", "galben"};

        for (String culoare : culori) {
            System.out.println("Culoarea actuala este: " + culoare);
        }

        // suma numerelor din array
        int s = 0;
        for (int numar : numere) {
            s += numar;
        }
        System.out.println("Suma numerelor este: " + s);
    }
}
