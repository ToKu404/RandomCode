public class Length {
  public static void main(String[] args) {
    int arr[][] = {{1,4,5},{0,6,8},{2,3,9}};
    int kolom = 3;
    int baris = 3;
    for(int i=baris-1;i>=0;i--){
      for(int j=0;j<kolom;j++){
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
  }
}
