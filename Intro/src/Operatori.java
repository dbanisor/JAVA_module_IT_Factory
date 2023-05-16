public class Operatori {
    public static void main(String[] args) {
        int a = 3; // o declarare && o initializare
        int b = 5;
        a = b; // o suprascriere

        System.out.println(a != b); // false
        System.out.println(a == b); // true
        System.out.println(7 > b || 3 > b); // 7 mai mare decat 5 SAU 3 mai mare decat 5
        System.out.println(7 > b && 3 > b); // 7 mai mare decat 5 SI 3 mai mare decat 5
        System.out.println(7 > b && (8 > b || 3 > b)); // true && true

    }
}
