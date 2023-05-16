public class While {
    public static void main(String[] args) {
        // zona de cod care se repeta atat timp cat o cdt este true

        // problema: masina merge cat inca are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) {
            // acceleram
            System.out.println("Vrum vrum!");
            // scadem benzina
            litri_benzina -= 1;
            // aprindem beculetul cand avem <= 3 litri
            if (litri_benzina <= 3) {
                System.out.println("Se aprinde becul rosu!");
            }
        }
        System.out.println("Stop. Nu mai avem benzina.");
    }
}
