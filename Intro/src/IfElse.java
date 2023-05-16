import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Flow control - if else
        // evalueaza conditii si bifurca codul in functie de rezultat
//        System.out.println("pornim radio");
//        boolean piesa_faina = true;
//        // daca imi place piesa, dau mai tare
//
//        if (piesa_faina == true) {
//            System.out.println("dau mai tare radio");
//            System.out.println("incep sa fredonez piesa");
//        }
//        System.out.println("oprim radio");
//
//        // if else
//        int nr = 5;
//        if (nr % 2 == 0) {
//            System.out.println("par");
//        } else {
//            System.out.println("impar");
//        }

        // if, else, if, else
        // luam date de la tastatura
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu ora:");
//        int ora = sc.nextInt();
//        if (ora < 0) {
//            System.out.println("ora invalida");
//        } else if (ora <= 11) {
//            System.out.println("buna dimineata");
//        } else if (ora <= 18) {
//            System.out.println("buna ziua");
//        } else if (ora <= 21) {
//            System.out.println("buna seara");
//        } else if (ora <= 24) {
//            System.out.println("noapte buna");
//        } else if (ora > 24) {
//            System.out.println("ora mai mare de 24");
//        }

        // < 0 - viteza invalida; 0 - stationeaza; <= 50 - in localitate; <= 90 - pe un drum judetean; > 90 - pe autostrada

//        Scanner scn  = new Scanner(System.in);
//        System.out.println("Introdu viteza:");
//        int viteza = scn.nextInt();
//
//        if (viteza < 0) {
//            System.out.println("Viteza invalida");
//        } else if (viteza == 0) {
//            System.out.println("Masina stationeaza");
//        } else if (viteza <= 50) {
//            System.out.println("Masina este in localitate");
//        } else if (viteza <= 90) {
//            System.out.println("Masina circula pe un drum judetean");
//        } else if (viteza > 90) {
//            System.out.println("Masina circula pe autostrada");
//        }

        // switch - se foloseste cand stim valorile posibile
        Scanner sc  = new Scanner(System.in);
        System.out.println("Alege optiunea:");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("Meniul anterior");
                break;
            case 1:
                System.out.println("Limba RO");
                break;
            case 2:
                System.out.println("Limba EN");
                break;
            default:
                System.out.println("Optiune inalida");
        }
    }
}
