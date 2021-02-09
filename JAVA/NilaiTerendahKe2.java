import java.util.*;
class NilaiTerendahKe2{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int n = san.nextInt();san.nextLine();
        String [] name = new String [n];
        double nilai [] = new double [n];
        for(int i=0;i<n;i++){
            name [i] = san.nextLine();
            nilai [i] = san.nextDouble();san.nextLine();
        }
        min(name,nilai);
    }

    public static void min(String name[],double nilai[]){
        double firstMin = nilai[0];
        double secondMin = nilai[0];
        for(int i=0;i<name.length;i++){
            if(nilai[i]<=firstMin){
                if(firstMin<=secondMin){
                    secondMin = firstMin;
                }
                firstMin = nilai[i];
            }
        }
        for (int i=0;i<name.length;i++) {
            if(nilai[i]==secondMin){
                System.out.println(name[i]);
            }
        }
    }
}