import java.util.Scanner;
public class EtkinlikOnerici {
    public static void main(String[] args) {

        int heat ;

        Scanner input = new Scanner(System.in);

        System.out.print("Sicaklik giriniz: ");
        heat = input.nextInt();
        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        if (heat >= 5 && heat <= 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat >= 10 && heat <= 25){
            System.out.println("Piknik e gidebiilirsiniz.");
        }
        if (heat >25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
