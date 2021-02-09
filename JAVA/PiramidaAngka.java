import java.io.*;
import java.util.Scanner;

public class PiramidaAngka{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        //tinggi piramid
        int tinggiPiramid = san.nextInt();
        //variabel bantu
        int NomorBaris = 1;
        int syarat = 1;
        //String untuk menyimpan output
        String fileOut = "";
        //perulangan sampai tinggi paramid
        for (int i=tinggiPiramid; i>0; i--){
            //buat spasi sampai (2xi)-2
            for (int j=1; j<=(2*i)-2; j++){
                fileOut+=" ";
            }
            //Masukkan angka dari ujung kiri sampai tengah
            for (int j = 1; j <= NomorBaris; j++){
                //jika angkanya >10 maka spasi buat angka nya dikurangi 1
            	fileOut+=j<10?j+"   ":j+"  ";
            }
            //Masukkan angka dari setelah tengah ke ujung kanan
            for (int j = NomorBaris; j >= 1; j--){
                //pengkondisian jika inputan tengah tidak diperlukan
                if(syarat%2!=0){
                    //pengkondisian agar hanya terisi dari sisi kanan
                    if(j!=NomorBaris){
                        //jika lebih besar 10 maka spasi dikurangi
                        fileOut+=j<10?j+"   ":j+"  ";
                    }
                }
                //jika inputan tengah diperlukan
                else{
                    //jika lebih besar 10 maka spasi dikurangi
                    fileOut+=j<10?j+"   ":j+"  ";
                }
            }
            fileOut+="\n"; 
            //jika barisnya ganjil maka nomor baris bertambah
            if(syarat%2==0){
                NomorBaris++;
            }
            syarat++;
        }
        print(fileOut);
    }
    public static void print(String fileOut){
        try(PrintWriter job = new PrintWriter("File1.txt");){
            //print fileOut
            job.write(fileOut);
            //sysout berhasil sebagai tanda bahwa perintah berhasil
            System.out.println("Perintah Berhasil Silahkan buka FIle1.txt");
        }catch(Exception io){
            System.out.println("Peintah Gagal");
            System.out.println(io.getMessage());
        }
    }
}