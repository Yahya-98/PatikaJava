import java.util.Scanner;
public class ModAlma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int range,n=0;
        double mean =0.0;

        System.out.print("Hedef sayiyi giriniz:");

        range = input.nextInt();

        for (int i = 0; i <= range; i++){
            if (i % 3 == 0 && i % 4 == 0){
                mean += i;
                n+=1;
                System.out.println(" n3 =" + n + " i = " + i);
            }
        }

        System.out.print("3 ve 4 e bölünenlein ortalami = " + (mean/n));

    }
}

