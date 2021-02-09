import java.util.*;

class SumNotFibonacci {
    // Sum Number Not Fibonacci Until Index
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        // input index yg mau dicari
        int index = san.nextInt();
        // n adalah bilangan yang di coba
        int n = 0;
        // k adalah index yg ditemukan bukan fibonacci yg hanya bertambah saat bukan
        // fibonacci
        int k = 0;
        boolean ditemukan = false;
        // perulangan sampai index
        while (k < index) {
            // pengecekan n apakah fibonacci
            ditemukan = fiboCek(n);
            // jika n bukan fibonacci maka k + 1
            if (ditemukan == true) {
                k++;
            }
            // pengecekan bilangan selanjutnya
            n++;
        }
        // penuliasan output
        System.out.println(n - 1);
    }

    public static boolean fiboCek(int n) {
        int fibo = 0;
        int a = 1;
        int b = 0;
        while (true) {
            // jika n adalah fibonacci
            if (fibo == n) {
                return false;
            }
            // jika n bukan fibonacci
            if (fibo > n) {
                return true;
            }
            fibo = a;
            a = b + a;
            b = fibo;
        }
    }
}