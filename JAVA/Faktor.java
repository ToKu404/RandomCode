import java.util.*;
class Faktor{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int n = san.nextInt();
        for(int i=n;i>0;i--){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}