import java.util.*;
class HardPassword{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        String pass = san.next();
        while(pass.length()<8){
            pass = san.next();
        }
        int kapital = 0;
        int kecil = 0;
        int nomor = 0;
        int symbol = 0;
        for(int i=0;i<pass.length();i++){
            int now = Character.codePointAt(pass, i);
            if(now>=97&&now<=122){
                kecil = 1;
            }
            else if(now>=65&&now<=90){
                kapital = 1;
            }
            else if(now>=48&&now<=57){
                nomor = 1;
            }
            else {
                symbol = 1;
            }
        }
        int sum = kecil+kapital+nomor+symbol;
        if(sum>2){
            System.out.println("Strongly");
        }
        else if(sum==2){
            System.out.println("Medium");
        }
        else{
            System.out.println("Weak");
        }
    }
}