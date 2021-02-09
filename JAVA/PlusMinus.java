import java.util.Scanner;

class PlusMinus{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int n = san.nextInt();
        double angka [] =  new double[n];
        double postif = 0;
        double negatif = 0;
        double nol = 0;
        for(int i=0;i<n;i++){
            angka[i] = san.nextDouble();
            if (angka[i]>0){
                postif++;
            }
            else if (angka[i]<0){
                negatif++;
            }
            else if (angka[i]==0){
                nol++;
            }
        }
        System.out.println(postif/n);
        System.out.println(negatif/n);
        System.out.println(nol/n);
    }
}