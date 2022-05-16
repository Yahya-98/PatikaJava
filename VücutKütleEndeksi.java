import java.util.Scanner;
public class VücutKütleEndeksi {
    public static void main(String[] args) {
        double kg,boy;
        Scanner input = new Scanner(System.in);
        

        System.out.print("Kilonuzu giriniz (kg cinsinden):");
        kg = input.nextFloat();

        System.out.print("Boyunuzu giriniz(metre cinsinden):");
        boy = input.nextFloat();

        System.out.println("Vücut Kitle Endeksiniz = " + kg /(boy*boy));
    }
}
