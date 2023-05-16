package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip ContBancar
        // sunt instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Denise Banisor", "Ro34INGB00009999945453434");
        ContBancar cont2 = new ContBancar("Banisor Andrei", "Ro20INGB0000999967677676");

        // apelam metoda descrere()
//        cont1.descriere();
//        cont2.descriere();

        // activam conturile()
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont1.interogareSold();
        cont2.interogareSold();

        // alimentam conturile
        cont1.alimentareCont(500.30);
        cont2.alimentareCont(700.00);
        cont1.alimentareCont(900.80);

        // negative testing
        cont1.debitareCont(2000);

        // positive testing cu suma exacta
        cont1.debitareCont(1401.1);

        // positive de 2x
        cont2.debitareCont(300);
        cont2.debitareCont(100);


        cont1.interogareSold();
        cont2.interogareSold();


    }
}
