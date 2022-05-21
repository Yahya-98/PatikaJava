import java.util.Arrays;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayi gireceksiniz ? ");
        int n = input.nextInt();

        int[] num = new int[n+1];

        for (int i = 1; i <= n; i++){
            System.out.print(i + " inci sayiyi giriniz: ");
            int number = input.nextInt();
            num[i] = number;
        }
        int tmp,tmp1;
        tmp = num[1];
        tmp1 = num[1];
        for (int i = 1; i <= n; i++){
            if (tmp < num[i]){
                tmp = num[i];
            }
            if (tmp1 > num[i]){
                tmp1 = num[i];
            }

        }
        System.out.print("min = " + tmp1 + " max = " + tmp);

    }
}

