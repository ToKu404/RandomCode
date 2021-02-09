// Its length is at least .
// It contains at least one digit.
// It contains at least one lowercase English character.
// It contains at least one uppercase English character.
// It contains at least one special character. The special characters are: !@#$%^&*()-+

//hitung jumlah point yang kurang

import java.util.*;
public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        int s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1;
        s1 = 6 - n;
        for(int i=0;i<n;i++){
            int k = (int)password.charAt(i);
            if(k>=65&&k<=90){
                s4 = 0;
            }
            else if(k>=97&&k<=122){
                s3 = 0;
            }
            else if (k>=48&&k<=57){
                s2 = 0;
            }
            else{
                s5 = 0;
            }
        }
        return s1>(s2+s3+s4+s5)?s1:(s2+s3+s4+s5);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);
        System.out.println(answer);
        scanner.close();
    }
}
