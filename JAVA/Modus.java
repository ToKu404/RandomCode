import java.util.*;
import java.util.Map.Entry;

class Modus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 1)
            return;
        
        HashMap<Integer, Integer> pki = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            pki.put(l, pki.getOrDefault(l, 0) + 1);
        }

        int iMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (Entry<Integer, Integer> v: pki.entrySet()) {
            int l = v.getKey();
            int r = v.getValue();
            if (r > max || (r == max && l > iMax)) {
                max = r;
                iMax = l;
            }
        }

        System.out.println(iMax);
    }
}
