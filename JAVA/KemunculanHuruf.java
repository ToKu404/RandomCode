import java.util.*;
class KemunculanHuruf{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        String huruf = san.nextLine().toLowerCase().replace(" ", "");
        char [] hur = huruf.toCharArray();
        Arrays.sort(hur);
        for(char i='a';i<'z';i++){
            int sum = 0;
            for(int j=0;j<hur.length;j++){
                if(i==hur[j]){
                    sum++;
                }
            }
            if(sum!=0){
                System.out.println(i+"    |"+sum);
            }
        }
    }
}