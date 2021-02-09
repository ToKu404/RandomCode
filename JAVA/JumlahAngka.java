import java.util.*;
class JumlahAngkaWithSort{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int n = san.nextInt();
        int num [] = new int [n];
        for(int i = 0 ; i < n ; i++){
            num [i] = san.nextInt();
        }
        jumlah(num);
    }
    static void jumlah(int num []){
        for(int i=0 ; i<num.length;i++){
            int sum = 0;
            for(int j=0; j<num.length;j++){
                if(num[i]==num[j]){
                    sum++;
                }
            }
            System.out.println(sum + " Angka "+ num[i]);
        }
    }
}