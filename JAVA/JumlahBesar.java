import java.util.*;

class JumlahBesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        if (a.matches(".*[^\\d].*"))
            return;
        
        String b = sc.next();
        if (b.matches(".*[^\\d].*"))
            return;
        
        byte aB[] = a.getBytes();
        byte bB[] = b.getBytes();
    }
}
