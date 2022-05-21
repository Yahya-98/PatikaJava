import java.util.Scanner;
public class AsalSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int n = input.nextInt();

        for (int i = 2; i <= n; i++){
            int res = 0;
            for (int j = 2; j <= i; j++){

                if (i % j == 0){
                    res++;
                }
            }
            if (res == 1){
                System.out.print(" " + i);
            }

        }
    }
}
