import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Eleman sayisini giriniz: ");
        int n = input.nextInt();
        int n1 = 0,n2 = 1,n3;

        System.out.print("1 2");

        for (int i = 2; i<=n; i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }


    }
}
