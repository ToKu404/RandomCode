import java.util.*;

class Fibo_2 {
    // Print Fibonacci Until Number Your Write
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int n = san.nextInt();
        String out = "0 ";
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                out += String.valueOf(i) + " ";
            }
        }
        System.out.print("Case " + (n + 1) + " : " + out.replace(" ", "").length() + " Number\n");
        System.out.print(out);
    }
}