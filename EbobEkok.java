import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));

        int n1,n2;
        System.out.print("n1 sayisini giriniz: ");
        n1 = input.nextInt();

        System.out.print("n2 sayisini giriniz: ");
        n2 = input.nextInt();
        int i = 1;
        while (i <= (n1*n2)){
            if(i % n1 == 0 && i % n2 ==0){
                System.out.print("EBOB = " + i);
                break;
            }i++;
        }
        System.out.print("\nEKOK = " + (n1*n2)/i);

    }
}
