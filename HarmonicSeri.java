import java.util.Scanner;
public class HarmonicSeri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        double res = 0.0, k = 1.0;

        System.out.print("N degeri giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){

            res += (1 / k);
            k += 1;

        }

        System.out.print("Seri sonucu = " + res);




    }
}
