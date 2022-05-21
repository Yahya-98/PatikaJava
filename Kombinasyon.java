import java.util.Scanner;
public class Kombinasyon {

    public static int factor(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,r;

        System.out.print("N  degerini giriniz : ");

        n = input.nextInt();

        System.out.print("R degerini giriniz");
        r = input.nextInt();

        System.out.println("Kombinasyon = " + (factor(n)/(factor(r) * (factor(n-r)))));



    }
}
