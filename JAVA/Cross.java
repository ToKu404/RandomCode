class Cross {
  public static void main(String[] args) {
    int A[] = { 8, 7, 0, 1, 3, 2, 5, 4, 6 };
    // int A[] = {0, 2, 4, 6, 8, 10, 12, 1, 3, 5, 7, 9, 11, 13}; //Untuk B
    int cross = 0;
    for (int i = 0; i < A.length - 1; i++) {
      for (int j = i + 1; j < A.length; j++) {
        if (A[i] > A[j]) {
          System.out.printf("%d-------%d\n", A[i], A[j]);
          cross++;
        }
      }
    }
    System.out.println(cross);
  }
}