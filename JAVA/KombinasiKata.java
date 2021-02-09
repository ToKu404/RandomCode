import java.util.*;
class KombinasiKata{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        String word = san.next().toLowerCase();
        int a = faktorial(word.length());
        char [] kar = word.toCharArray();
        int b = 1;
        for(char i = 'a' ; i < 'z' ; i++){
            int n =  0;
            for(int j=0;j<kar.length;j++){
                if(i==kar[j]){
                    n++;
                }
            }
            if(n>1){
                b*=faktorial(n);
            }
        }
        System.out.println(a/b);
    }
    public static int faktorial(int n){
        int rial = 1;
        for(int i=1;i<=n;i++){
            rial*=i;
        }
        return rial;
    }
}