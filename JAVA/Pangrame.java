import java.util.*;
class Pangrame{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
     String kata = pew.nextLine().toLowerCase().replace(" ", "\\s+");
       // System.out.println("pangram? " + pangram(kata));
        if(pangram(kata) == true){
            System.out.println("pangram");
        }else if (pangram(kata) == false){
            System.out.println("bukan pangram");
        }
    }
    static boolean pangram (String kata){
        if(kata.length() < 26){
            
            return false;
        }else{
            for (char i = 'a'; i <= 'z'; i++) {
                // System.out.println(kata.indexOf(i));
                if(kata.indexOf(i) <0){
                    return false;
                }
            }
        }
        return true;
    }
}