import java.util.*;
class CrosswithLength{
    static String nil = "";
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        String a = san.next();
        int b = san.nextInt();
        boolean desimal = false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.'){
                desimal=true;
                break;
            }
        }
        if(desimal==true){
            double ak = Double.parseDouble(a);
            nil = pangkat(ak,b);
            System.out.println(nil + " - " +(nil.replace(".","")).length()+" digit angka");
        }
        else{
            int ak = Integer.parseInt(a);
            nil = pangkat1(ak,b);
            System.out.println(nil + " - " +nil.length()+" digit angka");
        }
        
    }
    static String pangkat (double ak, int b){
        double ab = 1;
        for(int i=0;i<b;i++){
            ab*=ak;
            nil=String.valueOf(ab);
        }
        return nil;
    }
    static String pangkat1 (int ak, int b){
        int ab = 1;
        for(int i=0;i<b;i++){
            ab*=ak;
            nil=String.valueOf(ab);
        }
        return nil;
    }
}