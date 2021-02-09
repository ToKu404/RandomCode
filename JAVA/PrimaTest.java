import java.util.Scanner;
class PrimaTest{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int n = san.nextInt();
        for(int i=2;i<n;i++){
            if((n%i)==0){
                System.out.println("Bukan Prima");
                return;
            }
        }
        System.out.println("Prima");
    }
}