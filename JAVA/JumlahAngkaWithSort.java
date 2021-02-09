import java.util.*;
class JumlahAngkaWithSort{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int n = san.nextInt();
        int num [] = new int [n];
        for(int i = 0 ; i < n ; i++){
            num [i] = san.nextInt();
        }
        Arrays.sort(num);
        jumlah(num);
    }
    static void jumlah(int num []){
        int bantu = num[0];
        int sum = 1;
        for(int i=1;i<num.length;i++){
            if(bantu==num[i]){
                sum++;
            }
            else if(bantu!=num[i]){
                System.out.println(sum + " Angka "+bantu);
                bantu = num[i];
                sum = 1;
            }
            if(i==num.length-1){
                System.out.println(sum + " Angka "+bantu);
            }
        }
    }
}