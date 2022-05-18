import java.util.Arrays;
import java.util.Scanner;
public class HesapMakinasi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);

        System.out.print("ilk sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println(" 1 Toplama \n 2 cikarma \n 3 carpma \n 4 bölme");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("sayi 0 a bölünemez");
                    break;}
                System.out.println("Bölme: "+ (n1 / n2));
                break;
            default:
                System.out.println("Yanlis islem sectiniz");
        }




    }
}
