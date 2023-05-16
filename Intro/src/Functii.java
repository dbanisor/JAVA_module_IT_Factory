public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o fct in alta fct

    // o functie simpla care ne printeaza ceva pe ecran
    // nu returneaza nimic (nu are return)
    // nu are nici parametri

    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie care saluta clientul in fct de numele lui
    // nu returneaza nimic (nu are return)
    // are nevoie de parametri

    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume + "!");
    }

    // o functie care calculeaza media a 3 numere
    // returneaza un raspuns (suma numerelor)
    // ce tip de date va avea raspunsul? 3 + 6 / 2 = 4.5 ==> double
    // are nevoie de parametri

    // o functie care ne da valoarea lui PI
    // returneaza un raspuns
    // raspunsul va fi double
    // are nevoie de parametri? nu

    public static double piValue() {
        // constanta = variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }

    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia

        // intra clientul 2
        printGreeting(); // se apeleaza functia

        // apelam o fct cu parametri oferind argumente
        printGreetingByName("Banisor", "Denise");
        printGreetingByName("Banisor", "Andrei");
        printGreetingByName("Banisor", "Olivia");

        // apelam o fct cu parametri care are si return
        System.out.println(mediaNr(3, 3, 4));
        double media1 = mediaNr(31213, 312313, 423);
        System.out.println(media1);

        // apelam o functie fara parametri dar care are return
        System.out.println(piValue());

    }
}
