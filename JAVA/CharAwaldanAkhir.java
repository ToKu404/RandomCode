import java.util.*;
class CharAwaldanAkhir{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        String kata = san.next();
        System.out.print(kata.charAt(0)+" ");
        for(int i=1;i<kata.length()-1;i++){
            System.out.print(Character.codePointAt(kata, i)+" ");
        }
        System.out.println(kata.charAt(kata.length()-1));
    }
}