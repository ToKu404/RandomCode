import java.io.*;
import java.util.Scanner;
public class DiagonalAtasMatrix20{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        //indeks matrix
        int indeks = 20;
        //variabel untuk menampung jumlah
        long sum = 0;
        //array untuk menampung value matrix
        int num [][] = new int [indeks][indeks];
        //file out untuk di print
        String fileOut = "Matrix 20x20\n";
        for(int i=0;i<indeks;i++){
            for(int j=0;j<indeks;j++){
                //input
                num[i][j]=san.nextInt();
                //masukkan input ke fileout
                fileOut+=num[i][j]+"\t";
                //jika berada pada diagonal atas maka akan ditambahkan ke sum
                if(j>=i){
                    sum+=num[i][j];
                }
            }
            fileOut+="\n";
        }
        //menambahkan sum ke file out
        fileOut+="Jumlah diagonal atas = "+ sum;
        //memanggil method print
        print(fileOut);
    }
    public static void print(String fileOut){
        try(PrintWriter job = new PrintWriter("File3.txt");){
            //mencetak fileOut
            job.write(fileOut);
            //sysout berhasil jika perintah berhasil
            System.out.println("Perintah Berhasil Silahkan buka File3.txt");
        }catch(Exception io){
            System.out.println("Peintah Gagal");
            System.out.println(io.getMessage());
        }
    }
}