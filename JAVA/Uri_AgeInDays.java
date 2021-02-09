import java.util.*;

class AgeInDays {
    private static Scanner san = new Scanner(System.in);
    static int a = san.nextInt();

    public static void main(String[] args) {
        years();
        mounth();
        days();
    }

    static void years() {
        System.out.println(a / 365);
        a = a % 365;
    }

    static void mounth() {
        System.out.println(a / 30);
        a = a % 30;
    }

    static void days() {
        System.out.println(a);
    }
}