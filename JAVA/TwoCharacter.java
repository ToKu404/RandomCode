//berapa 2 karakter selang seloing terpanjang
import java.util.*;

public class TwoCharacter {

    // Complete the alternate function below.
    static int alternate(String s) {
        int beda = 0;
        char key = '1';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=key){
                key = s.charAt(i);
                beda++;
            }
        }
        char huruf [] = new char [beda];
        int in = 0;
        key = '1';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=key){
                key = s.charAt(i);
                huruf [in] = s.charAt(i);
                in++;
            }
        }
        int max = 0;
        String kata = "";
        char kata1, kata2;
        for(int i=0;i<beda;i++){
            kata1 = huruf [i];
            for(int j=1;j<beda;j++){
                kata2 = huruf [j];
                char simpan = kata1;
                kata= String.valueOf(simpan);
                max = 0;
                for(int k=1;k<s.length();k++){
                    if(s.charAt(k)==kata1||s.charAt(k)==kata2){
                        if(s.charAt(k-1)==kata1){
                            kata+=kata2;
                        }
                        else if(s.charAt(k-1)==kata2){
                            kata+=kata1;
                        }
                        else{
                            kata+="";
                        }
                    }
                }
                if(String.valueOf(kata).length()>max){
                    System.out.println(kata);
                    max = String.valueOf(kata).length();
                } 
            }
        }
        return max;
    }
    static Scanner san = new Scanner (System.in);
    public static void main(String[] args) {

        int l = san.nextInt();san.nextLine();

        String s = san.nextLine();

        int result = alternate(s);

        System.out.println(result);
    }
}
