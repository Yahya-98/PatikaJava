import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {

        int mat,fizik,turk,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Turkce notunuz: ");
        turk = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();


        double ort = 0;
        int counter = 0;
        if (mat <=100 && mat >= 0){ ort += mat; counter++;}
        if (turk <=100 && turk >= 0){ ort += turk; counter++;}
        if (fizik <=100 && fizik >= 0){ ort += fizik; counter++;}
        if (kimya <=100 && kimya >= 0){ ort += kimya; counter++;}
        if (muzik <=100 && muzik >= 0){ ort += muzik; counter++;}

        ort /= counter;


        if (ort <= 55){
            System.out.println("Sinifta kaldiniz !");
        }
        else{
            System.out.println("Tebrikler sinifi gectiniz");
        }
        System.out.println("Ortalmaniz = " + ort);

    }
}
