import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();
        int res = 0;

        for (int i = 1; i <= number; i++){
            if (number % i == 0 && number != i){

                res += i;
            }
        }
        if (res == number){
            System.out.println(number + "  Mükemmel sayidir");
        }else{
            System.out.println(number + " Mükemmel sayi degildir");
        }
    }
}
