import java.util.Scanner;
public class HarmonikOrt {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        System.out.print("Dizi Boyutunu giriniz : ");
        int k = input.nextInt();
        int[] numbers = new int[k];

        for(int i = 0; i <numbers.length; i++){
            System.out.println((i+1) + " inci veriyi giriniz : ");
            numbers[i] = input.nextInt();
        }

        double sum = 1.0;

        for (int i = 0; i < numbers.length; i++){
            sum += (1 / numbers[i]);
        }
        System.out.println("Harmonik Ortalama = " + (numbers.length / sum));
    }
}
