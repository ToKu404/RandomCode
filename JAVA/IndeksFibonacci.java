import java.util.*;
class IndeksFibonacci{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int n = san.nextInt();
        int fibo = 0;
        int a = 1;
        int b = 0;
        for(int i=0;i<n;i++){
            fibo = a;
            a = a+b;
            b = fibo;
        }
        System.out.println(fibo);
    }
}