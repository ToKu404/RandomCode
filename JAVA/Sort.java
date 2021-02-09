class sort 
{
  public static void main(String[] args) {
    int angka[] = {2, 4, 3, 6, 4};
    for (int i = 1; i < angka.length; ++i) {
      int key = angka[i];
      System.out.println("key = "+key);
      int j = i-1;
      while (j>=0 && angka[j]>key){
        angka[j+1] = angka[j];
        System.out.println("Angka J("+(j+1)+") = "+angka[j+1]);
        j--;
      }
      angka[j+1] = key;
      System.out.println("Angka J("+(j+1)+") = "+angka[j+1]);
    }
    for (int i : angka) {
      System.out.print(i+" ");
    }
  }
}