import java.util.Scanner;
class SumInfinityInt{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        //int k = san.nextInt();
        String ko = san.next();
        //int m = san.nextInt();
        String mo = san.next();
        
        boolean finish = true;
        int x = mo.length()-1;
        int y = ko.length()-1;
        int next = 0;
        String hasil = "";
        while(finish==true){
            int a = 0 , b = 0, sum = 0;
            if(x>=0){
                a = Integer.parseInt(mo.substring(x, x+1));
                x--;
            }
            if(y>=0){
                b = Integer.parseInt(ko.substring(y, y+1));
                y--;
            }
                sum = (next+a+b)%10;
                next = ((next+a+b))/10;
            if(x<0&&y<0){
                finish=false;
            }
            
            if((x<0||y<0)&&((next+a+b)/10)!=0){
                hasil+=String.valueOf((next+a+b)/10);
            }
                hasil+=String.valueOf(sum);
        }
        for(int i=hasil.length()-1;i>=0;i--){
            System.out.print(hasil.charAt(i));
        }
    }
}