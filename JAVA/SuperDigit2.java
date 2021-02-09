import java.util.*;
/**
 * SuperDigit2
 */
public class SuperDigit2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // 148
        int loop = sc.nextInt();
        // 3
        int temp = 0;
        //3 * (1 + 4 + 8)
        for (int i = 0; i < input.length(); i++) {
            temp += (input.charAt(i) % '0');        
        }
        temp *= loop;

        int counter = 0;
        while (temp >= 10) {
            input = String.valueOf(temp);
            for (int i = 0; i < input.length(); i++) {
                counter += (input.charAt(i) % '0');
            }         
            temp = counter;
            counter = 0;  
        }
        System.out.println(temp);
    }
}