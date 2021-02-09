import java.util.*;

public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        int total=1;
        for(int i=0;i<s.length();i++){
            int k = (int) s.charAt(i);
            if(k<97){
                total++;
            }
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();

        int result = camelcase(s);

        System.out.println(result);
    }
}
