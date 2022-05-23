import java.util.Scanner;
public class DesenMetod {
    static int count = 0,m = 0;

    static int game(int n){
        System.out.print(" " + n);
        if(n > 0 && m == 0){
            count++; // negatife ulastiktan sonra kac kez artiracagini kaaydedecek
            return game(n - 5);
        }else if (n+5 > n && count > 1){
            count--; // res kadar kez artiracak
            m = 1; // artik azalma yapmayacak
            return  game(n + 5);
        }else {
            System.out.print(" ");
            return n + 5;}
        }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("N degeri giriniz: ");

        int n = input.nextInt();

        System.out.println(game(n));


    }
}

