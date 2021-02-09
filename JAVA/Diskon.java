import java.util.Scanner;
class Diskon{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int buy = san.nextInt();
        int diskon = buy;
        if(buy>=50000&&buy<100000){
            diskon-=buy*50/100;
        }
        else if(buy<50000){
            diskon-=buy*70/100;
        }
        else{
            diskon-=50000;
        }
        System.out.println("Harga Awal = "+buy);
        System.out.println("Harga Setelah Diskon = "+diskon);
    }
}