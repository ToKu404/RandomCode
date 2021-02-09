import java.util.Scanner;
class SuperDigit{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        //input super digit
        String numb = san.next();
        //input looping
        int n = san.nextInt();
        String number = "";
        //super digit+super digit looping
        for(int i=0;i<n;i++){
            number+=numb;
        }
        //super
        Super(number);  
    }
    public static void Super (String number){
        int num = 0;
        //
        for(int i=0;i<number.length();i++){
            num += Integer.parseInt(number.substring(i, i+1));
        }
        number = String.valueOf(num);
        //selama number >1 maka panggil super lagi
        if(number.length()>1){
            Super(number);
        }
        //jika tidak cetak
        else{
            System.out.println(number);
        }
    }
}