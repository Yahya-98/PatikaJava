import java.util.Scanner;
public class NotOrtalamasiHesabi {
    public static void main(String[] args) {
        // Veriables created
        int mat, fizik, kimya, turkce, tarih, muzik, ort;

        // Created scanner
        Scanner input = new Scanner((System.in));

        // Data input
        System.out.print("Matematik Notu Giriniz ");
        mat = input.nextInt();


        System.out.print("Fizik Notu Giriniz ");
        fizik = input.nextInt();


        System.out.print("Kimya Notu Giriniz ");
        kimya = input.nextInt();


        System.out.print("Turkce Notu Giriniz ");
        turkce = input.nextInt();


        System.out.print("Tarih Notu Giriniz ");
        tarih = input.nextInt();


        System.out.print("Muzik Notu Giriniz ");
        muzik = input.nextInt();

        System.out.print(("Gecme Notu Giriniz "));
        ort = input.nextInt();

        double result = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamanız :" + result);

        if (result >= ort){
            System.out.print("Sınıfı Gecti");
        }
        else{
            System.out.print("Sınıfta Kaldı");
        }
    }
}
