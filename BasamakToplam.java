import java.util.Scanner;
public class BasamakToplam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, res = 0;
        double  a;

        System.out.print("Sayiyi giriniz: ");

        number = input.nextInt();

        while (number != 0){  // basamak sayisi bulucu

            res += (number % 10);
            number /= 10;

        }

        System.out.print(res);


    }
}
