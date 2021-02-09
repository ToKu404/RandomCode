import java.util.*;
class HurufSeling{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int n = san.nextInt();
        String h [] = new String [n];
        for(int i=0;i<n;i++){
            System.out.print("word = ");
            h[i] = san.next();
        }
        for(int j=0;j<n;j++){
            System.out.println(alternatingCharacters(h,j));
        }
    }
    static int  alternatingCharacters (String h[],int j){
        int hapus = 0;
        for(int i=0;i<h[j].length()-1;i++){
                if(h[j].charAt(i)==h[j].charAt(i+1)){
                    hapus++;
            }
            else{
                continue;
                }
            }
        return hapus;
    }
}