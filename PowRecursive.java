import java.util.Scanner;
public class PowRecursive {
    static  int res = 1;
    static int pow(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        res *= base;
        pow(base, exp - 1);
        return res;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban degerini giriniz: ");
        int n = input.nextInt();
        System.out.print("Üs degerini giriniz: ");
        int m = input.nextInt();
        System.out.println("Sonuc = " + pow(n,m));
    }
}

