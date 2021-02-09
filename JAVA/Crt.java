public class Crt {
  // Method Mencari FPB
  static int cariFPB(int a, int b) {
    if (b > 0) {
      return cariFPB(b, a % b);
    }

    return a;
  }

  // Method Mencari Menentikan koprima
  static boolean isKoPrima(int m[]) {
    for (int i = 0; i < m.length - 1; i++) {
      for (int j = i + 1; j < m.length; j++) {
        if (cariFPB(m[i], m[j]) != 1) {
          return false;
        }
      }
    }

    return true;
  }

  // Method Mencari Invers
  static int cariInvers(int m, int n) {
    if (cariFPB(m, n) != 1) {
      return -1;
    }

    int r0 = m > n ? m : n;
    int r1 = r0 == m ? n : m;
    int t0 = 1;
    int t1 = 0;
    int min = Math.min(m, n);

    while (r1 != 0) {
      int q = r0 / r1;

      int tk = t0 - q * t1;
      t0 = t1;
      t1 = tk;

      int temp = r0 % r1;
      r0 = r1;
      r1 = temp;
    }
    return t0 < 0 ? (t0 + min) : t0;
  }

  // Algoritma CRT
  static int crtAlgorithm(int a[], int m[]) {
    if (!isKoPrima(m))
      return -1;

    int mn = 1;
    for (int i : m) {
      mn *= i;
    }
    System.out.println("-------------------------");
    System.out.println("M = " + mn);
    System.out.println("-------------------------");
    int mi[] = new int[a.length];
    for (int i = 0; i < mi.length; i++) {
      mi[i] = mn / m[i];
      System.out.println("M" + i + " = " + mi[i]);
    }
    System.out.println("-------------------------");
    int l[] = new int[a.length];
    for (int i = 0; i < l.length; i++) {
      System.out.println("Li = " + mi[i] + " Mod " + m[i]);
      System.out.println("Li = " + mi[i] % m[i] + " Mod " + m[i]);
      l[i] = cariInvers(m[i], mi[i]) % m[i];
      System.out.println("Li-1 = " + l[i]);
      System.out.println("-------------------------");
    }
    System.out.println("-------------------------");
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum = sum + (a[i] * mi[i] * l[i]);
    }
    System.out.println("X = " + sum + " mod " + mn);
    System.out.println("X = " + sum % mn + " mod " + mn);
    return sum % mn;

  }

  public static void main(String[] args) {
    int a[] = { 5, 3, 9 };
    int m[] = { 7, 11, 13 };
    for (int i = 0; i < m.length; i++) {
      System.out.println("X Kongruen " + a[i] + " mod " + m[i]);
    }
    System.out.println("X = " + crtAlgorithm(a, m));
  }

}
