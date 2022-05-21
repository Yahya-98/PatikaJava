import java.util.Scanner;
public class CiftToplam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number,res = 0;

        System.out.println("Tek sayi girene kadar program devam edecektir..");

        do {
            System.out.print("Sayi giriniz: ");

            number = input.nextInt();

            if (number % 4 == 0){
                res += number;
            }
        }while (number % 2 == 0);

        System.out.print("Toplam = " + res);
    }
}
