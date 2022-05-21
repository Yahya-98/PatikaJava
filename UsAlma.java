import java.util.Scanner;
public class UsAlma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pov;

        System.out.print("Üs derecesini giriniz: ");

        pov = input.nextInt();

        for (int i = 1; i <= pov; i++){
            System.out.println("4 ^ " + i + " = " + Math.pow(4,i) + "   5 ^ " + i + " = " + Math.pow(5,i));
        }
    }
}
