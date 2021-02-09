import java.io.*;
import java.util.Scanner;
public class DollartoPart{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int b;
        //input uang yang mau dipecah
        double in = san.nextDouble();
        //untuk menampung data yang panjang kita ubah dulu ke long
        long a = (long)(in*100);
        san.close();
        //array pecahan uang
        //semuanya dikali 100 baru nanti kita bagi 100 karena pada double pada operasinya hasilnya tidak akan persis sama
        int dollars [] = {10000,5000,2000,1000,500,200,100,50,25,10,5,1};
        //file untuk di print
        String fileOut = "UANG : "+in+"\nPECAHAN DOLLAR\n";
        for(int i=0;i<12;i++){
            //mencari jumlah pecahan
            b = (int)a/dollars[i];
            fileOut+=String.format("%d uang $%.2f\n",b,(double)dollars[i]/100.0);
            //sisa uang
            a = a % dollars[i];
        }
        print(fileOut);
    }
    public static void print(String fileOut){
        try(PrintWriter job = new PrintWriter("File2.txt");){
            //print fileOut
            job.write(fileOut);
            //sysout berhasil sebagai tanda bahwa perintah berhasil
            System.out.println("Perintah Berhasil Silahkan buka File2.txt");
        }catch(Exception io){
            System.out.println("Peintah Gagal");
            System.out.println(io.getMessage());
        }
    }
}