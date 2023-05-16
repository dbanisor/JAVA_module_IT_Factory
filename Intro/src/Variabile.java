public class Variabile {
    public static void main(String[] args) {
        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed - trebuie sa specificam tipul de variabila

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascrierea
        modelMasina = "XC 60 Facelift";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // declarare
        String nume;
        String prenume;

        //initializare
        prenume = "Denise";
        nume = "Banisor";
        System.out.println(prenume + " " + nume);
    }
}
