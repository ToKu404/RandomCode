import java.util.Scanner;
class Euclid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input 2 bilangan yang ingin dicari fpb nya
        System.out.print("Input 2 Bilangan : ");
        int a = input.nextInt();
        int b = input.nextInt();
        // Mengabsolutekan a dan b
        // Kemudian memanggil method untuk menjalankan algoritma Euclid
        int fpb = fpb(Math.abs(a), Math.abs(b));

        // Output
        System.out.println("FPB dari (" + a + "," + b + ") = " + fpb);
        input.close();
    }

    // Algoritma Euclid dengan Metode Rekursif
    static int fpb(int a, int b) {
        if (b == 0) {
            return a;
        }
        return fpb(b, a % b);
    }
}
