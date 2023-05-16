package oop;

public class ContBancar {
    // program files = definim logica unui cont bancar

    // oop = object oriented programming

    // o clasa = este un tip nou
    // este definitia unui concept (blueprint)
    // reteta la paste carbonara spre exemplu
    // ex.: clasa Car

    // un obiect = este instanta unei clase
    // portia de paste carbonara facuta in urma retetei
    // ex.: 10 obiecte de tip Car

    // fields = proprietati = atribute
    // variabile
    // ex.: culoare, marca, model, consum, pret, esteOprita

    // metode - actiuni ce pot fi facute de obiecte
    // functii
    // ex.: accelereaza(), franeaza(), deschideUsa(), vopsire()

    // proprietatile, fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercariActivare = 0;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare, required fields

    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode - actiunile clasei
    public void interogareSold() {
        System.out.println("Titular cont: " + this.titularCont);
        System.out.println("IBAN cont: " + this.iban);
        System.out.println("Sold cont: " + this.sold);
        System.out.println("Cont activ? : " + this.activ);
        System.out.println("Nr de incercari gresite: " + this.incercariActivare);
        System.out.println("-----------------------------------------------------");
    }

    public void activareCont(int pinUtilizator) {
        // modificam activ in true doar daca pin-ul este corect
        this.salut();
        if (pinUtilizator == this.pin) {
            System.out.println("Card activat cu succes!");
            this.activ = true;
        } else {
            System.out.println("PIN gresit");
            this.incercariActivare++; // se incrementeaza
        }
    }

    public void alimentareCont(double suma_depusa) {
        // la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold += suma_depusa;
        this.salut();
        System.out.println("Ati depus cu succes suma de: " + suma_depusa + ". Aveti in cont suma de: " + this.sold);
    }

    public void debitareCont(double suma_retrasa) {
        this.salut();
        if (suma_retrasa <= this.sold) {
            this.sold -= suma_retrasa;
            System.out.println("Ai cheltuit " + suma_retrasa);
            System.out.println("Mai ai " + this.sold);
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }

    public void salut() {
        System.out.println("Buna " + this.titularCont);
    }
}
