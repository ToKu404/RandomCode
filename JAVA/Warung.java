import java.util.Scanner;
class Warung{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int kode = san.nextInt();
        int jumlah = san.nextInt();
        int harga [] = {4000,4000,2000,1000};
        System.out.println("Total = Rp. "+(jumlah*harga[kode-1]));
    }
}