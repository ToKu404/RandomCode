import java.util.*;
class TheDay{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int day = san.nextInt();
        int mounth = san.nextInt();
        int year = san.nextInt();
        System.out.println(findDay(day,mounth,year));
    }
    static String findDay(int day, int mounth, int year){
        int bulan []= {31,28,31,30,31,30,31,31,30,31,30,31};
        String []days = {"Jumat","Sabtu","Minggu","Senin","Selasa","Rabu","Kamis"};
        int alldays = 0;
        for(int i=2000;i<year;i++){
            if(i%4==0){
                alldays++;
            }
            alldays+=365;
        }
        for(int i=0;i<mounth-1;i++){
            if(i == 1&& year%4==0){
                alldays++;
            }
            alldays +=bulan[i];
        }
       alldays += day;
        return days [alldays%7];
    }
}