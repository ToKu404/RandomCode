import java.util.Arrays;
import java.util.Scanner;
class JumlahHuruf{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        String n = san.next();
        char hur [] = n.toCharArray();
        Arrays.sort(hur);
        char banding = hur[0];
        int jumlah = 1;
        for(int i=1;i<hur.length;i++){
            if(banding!=hur[i]){
                jumlah++;
                banding = hur[i];
            }
        }
        System.out.println(jumlah);
    }
}