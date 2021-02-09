import java.util.*;
class Tiktaktoe{
    static Scanner san = new Scanner(System.in);
    static Random ran = new Random();
    public static void main(String[] args) {

        System.out.println("WELCOME TO TIKTAKTOE");
        System.out.println("1. Player vs Player");
        System.out.println("2. Player vs COM");
        System.out.print(">");
        try{
            int choice = san.nextInt();san.nextLine();
            System.out.println("ATURAN MAIN : \n1. Masukkan 2 inputan angka [1-3] dipisahkan dengan spasi\nMisalkan : 1 1\n-----------\n X |   |   \n-----------\n   |   |   \n-----------\n   |   |   \n-----------\n2. Bila inputan telah terisi masukkan inputan lain\n3. Buatlah satu jalur berbaris dan anda menang");
            switch (choice) {
                case 1:
                    game1();
                    break;
                case 2:
                    game2();
                    break;
                default:
                    break;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //method papan
    // Tic Tac Toe papan
	//  1 1 | 1 2 | 1 3
	// -----------------
	//  2 1 | 2 2 | 2 3
	// -----------------
	//  3 1 | 3 2 | 3 3
    public static void board(String [][]tik) {
        System.out.println("\n-----------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; ++j) {
                //pengisian papan
                String contain = tik[i][j]!=null?tik[i][j]:" ";
                System.out.printf(j==2?" "+contain+" ":" "+contain+" |");
            }
            System.out.println();
            System.out.println("-----------"); 
            }
            System.out.println();
    }
    //method GAME OVER
    public static Integer bye (int over, String [][] tik, int game){
        //selesai karena winner
        int statusGame=win(tik,game);
        if(statusGame==1){
            return 1;
        }
        //selesai karena draw
        else if (over==9&&statusGame==0){
        System.out.println("DRAW");
            return 1;
        }
        return 0;
    }
    //method player 1
    public static int player1 (String [][] tik){
        boolean gameX = true;
        while(gameX==true){
            System.out.print("Player (X) : ");
            int x = san.nextInt()-1;
            int y = san.nextInt()-1;
            if(x>2||y>2){
                System.out.printf("input [%d] [%d] tidak valid\n",x+1,y+1);
            }
            else if(tik[x][y]==null){
                tik[x][y] = "X";
                board(tik);
                gameX=false;
            }else{
                System.out.println("try again, input tidak tersedia\n");
            }
        }
        return 1;
    }
    //method player 2
    public static int player2 (String [][] tik){
        boolean gameY = true;
        while(gameY==true){
            System.out.print("Player 2 (O) : ");
            int x = san.nextInt()-1;
            int y = san.nextInt()-1;
            if(x>2||y>2){
                System.out.printf("input [%d] [%d] tidak valid\n",x+1,y+1);
            }
            else if(tik[x][y]==null){
                tik[x][y] = "O";
                board(tik);
                gameY=false;
            }else{
                System.out.println("try again, input tidak tersedia\n");
            }
        }
        return 1;
    }
    //method computer
    public static int com (String [][] tik){
        boolean gameY = true;
        while(gameY==true){
            int x = ran.nextInt(7);
            int y = ran.nextInt(7);
            x=Math.abs(x)>2?Math.abs(x)%2:Math.abs(x);
            y=Math.abs(y)>2?Math.abs(y)%2:Math.abs(y);
            if(tik[x][y]==null){
                System.out.println("COM (0) : "+(x+1)+" "+(y+1));
                tik[x][y] = "O";
                board(tik);
                gameY=false;
            }
        }
        return 1;
    }
    //method player vs player
    public static void game1(){
        int game = 1;
        String [][] tik = new String [3][3];
        int gameOver = 0;
        int over = 0;
        System.out.print("\nGAME STARTS");
        board(tik);
        while(gameOver==0){
            //player 1
            over += player1(tik);
            gameOver = bye(over, tik, game);
            //player 2
            if(gameOver==0){
                over += player2(tik);
                gameOver = bye(over, tik, game);
            }
        }
    }
    //method com vs player
    public static void game2(){
        String [][] tik = new String [3][3];
        int game = 2;
        int gameOver = 0;
        int over = 0;
        System.out.print("\nGAME STARTS");
        board(tik);
        while(gameOver==0){
            //player 1
            over += player1(tik);
            gameOver = bye(over, tik, game);
            //COM
            if(gameOver==0){
                over += com(tik);
                gameOver = bye(over, tik, game);
            }
        }
    }
    //method winner
    static Integer win (String [][] tik, int game){
        String datar = "";
        String tegak = "";
        String diagonalKiri = "";
        String diagonalKanan = "";
        String bantu [][] = new String [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                bantu [i][j]=tik[j][i];
            }
        }
        int bantuin = 2;
        for(int i=0;i<3;i++){
            datar = "";
            tegak = "";
            for(int j=0;j<3;j++){
                datar+=tik[i][j];
                tegak+=bantu[i][j];
                if(i==j){
                    diagonalKiri+=tik[i][j];
                }
            } 
            diagonalKanan+=tik[i][bantuin];
            bantuin--;
            if(datar.equals("XXX")||diagonalKiri.equals("XXX")||tegak.equals("XXX")||diagonalKanan.equals("XXX")){
                System.out.println("**** Player 1 (X) WIN *****");
                return 1;
            }
            else if(datar.equals("OOO")||diagonalKiri.equals("OOO")||tegak.equals("OOO")||diagonalKanan.equals("OOO")){
                System.out.println(game==1?"**** Player 2 (Y) WIN ****":"**** COM WIN ****");
                return 1;
            }
        }
        return 0;
    }
}