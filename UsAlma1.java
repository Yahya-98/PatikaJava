import  java.util.Scanner;
public class UsAlma1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i,j;

        System.out.print("Taban degerini giriniz: ");
        i = input.nextInt();
        System.out.print("Üs degerini giriniz: ");
        j = input.nextInt();

        System.out.print("Cevap = " + Math.pow(i,j));
    }
}
