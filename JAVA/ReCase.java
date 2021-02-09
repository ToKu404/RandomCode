import java.util.*;
class ReCase{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        String word = san.nextLine();
        System.out.println(re(word));
    }
    static String re(String word){
        String new1 = "";
        for(int i=0;i<word.length();i++){
            char nick = word.charAt(i);
            if((int)nick>=97&&(int)nick<=122){
                new1+=String.valueOf(nick).toUpperCase();
            }
            else if((int)nick>=65&&(int)nick<=90){
                new1+=String.valueOf(nick).toLowerCase();
            }
            else{
                new1+=String.valueOf(nick);
            }
        }
        return new1;
    } 
}