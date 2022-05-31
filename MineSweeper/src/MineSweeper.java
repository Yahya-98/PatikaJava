import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int rowNumber;
    int colNumber;
    String[][] arr = new String[rowNumber][colNumber];


    MineSweeper(int rowNumber, int colNumber){ // row satır  col sütun
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;

    }

    public String[][] mineCreator(int minecount){
        String[][] mine = new String[rowNumber][colNumber];
        Random rand = new Random();
        for(int i = 0; i <= minecount; i++){   // mayin üretme ve yerlestirme
            int rand1 = rand.nextInt(rowNumber);
            int rand2 = rand.nextInt(colNumber);
            mine[rand1][rand2] = " * ";
        }
        for (int i = 0; i < rowNumber; i++){
            for (int j = 0; j < colNumber; j++){
                if(mine[i][j] == null){
                    mine[i][j] = " - ";
                }
            }
        }
        return mine;
    }

    public void printer(String[][] arr){
        System.out.println("");
        for(int i = 0; i < rowNumber; i++){
            for (int j = 0; j <colNumber; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println( "    " );   // sütun numarası yazıcı
        }
    }

    public int[] playerInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Satır Giriniz: ");
        int row = input.nextInt();
        while (row >= rowNumber){
            System.out.print("Girdiginiz Satir Oyun alanı dısındadır lütfen 0 ile " + rowNumber + " arasında bir deger giriniz: ");
            row = input.nextInt();
        }
        System.out.print("Sütun Giriniz: ");
        int col = input.nextInt();
        while (col >= colNumber){
            System.out.print("Girdiginiz Sütun Oyun alanı dısındadır lütfen 0 ile " + colNumber + " arasında deger giriniz: ");
            col = input.nextInt();
        }
        int[] res1 = {row, col};
        return res1;
    }

    public  int isMine(int x, int y, String[][] miner){
        if(x >= 0 && y >= 0 && x < rowNumber && y < colNumber){ // alan icinde oldugunu kontrol ediyor
            if(miner[x][y] == " * "){ //mayın varsa 1 döndürür
                return 1;
            }else{return 0;} // mayın yoksa 0 döndürür
        }
        return -1; // alan dısindaysa -1 döndürür
    }

    public int mineCounter(int[] a, String[][] miner){

        int counter = 0;

        for (int i = 0; i < 8; i++){
            int n1 = a[0];
            int n2 = a[1];
            int res = 0;
            switch (i){
                case 0:
                    --n1;
                    --n2;
                    res = isMine(n1, n2 , miner);
                    if (res == 1){ counter++;}
                    break;
                case 1:
                    --n1;
                    res = isMine(n1, n2 , miner);
                    if (res == 1){ counter++;}
                    break;
                case 2:
                    --n1;
                    ++n2;
                    res = isMine(n1, n2 , miner);
                    if (res == 1){ counter++;}
                    break;
                case 3:
                    --n2;
                    res = isMine(n1, n2 , miner);
                    if (res == 1){ counter++;}
                    break;
                case 4:
                    ++n2;
                    res = isMine(n1, n2 , miner);
                    if (res == 1){ counter++;}
                    break;
                case 5:
                    ++n1;
                    --n2;
                    res = isMine(n1, n2 , miner);
                    if (res == 1){ counter++;}
                    break;
                case 6:
                    ++n1;
                    res = isMine(n1, n2 , miner);
                    if (res == 1){ counter++;}
                    break;
                case 7:
                    ++n1;
                    ++n2;
                    res = isMine(n1, n2 , miner);
                    if (res == 1){ counter++;}
                    break;
            }
        }
        return counter;
    }

    public int game(int[] turn, String[][] arr, String[][] arr1){

        if (arr[turn[0]][turn[1]] == " * "){
            System.out.println("\n======Mayına Bastınız Oyun Bitti======");
            return 0;
        }else {

            int res = mineCounter(turn, arr);
            arr1[turn[0]][turn[1]] = " " + Integer.toString(res); // mayın sayısını kordinata yazar
            System.out.println("--------------------");

        }
        printer(arr1);
        return 1;

    }

    public void run(){

        String[][] arr = new String[rowNumber][colNumber];
        String[][] screen = new String[rowNumber][colNumber];
        int[] turn = new int[1];
        int minecount = (rowNumber * colNumber) / 4;  // mayın sayısını hesaplar
        arr = mineCreator(minecount);  // mayınları ekler
        printer(arr); // bu mayınları görebilmek için
        System.out.println("yukardaki aslında yok");
        for (int i = 0; i < rowNumber; i++){
            for (int j = 0; j < colNumber; j++){
                screen[i][j] = " - ";
            }
        }
        printer(screen);
        int moveCounter = (rowNumber * colNumber) - minecount; //mayına basmadan oynanabilecek maks hamle sayısı
        int gameover ;  // mayına basınca oyunu bitirir
        while (moveCounter > 1){ // hamle sayısı kadar oyunu deva mettirir
        turn = playerInput();
        gameover =game(turn,arr,screen);
        if (gameover == 0){
            moveCounter = gameover;
            }
        moveCounter--;
        if(moveCounter == 1){
            System.out.println("-------------------------");
            System.out.println("======TEBRİKLER KAZANDINIZ====== ");
        }
        }

    }
}
