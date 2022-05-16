import java.util.Scanner;
public class HipotenüsHesabi {

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("A ve B kenar uzunluklarını giriniz :");
        a = input.nextInt();
        b = input.nextInt();
        double c = Math.sqrt((a*a) + (b*b));
        double u = (a+b+c)/2;
        double alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("C uzunlugu = " + c);
        System.out.println("Üçgenin çevresi = " + u*2);
        System.out.println("Üçgenin alanı = "+ alan);

    }



}
