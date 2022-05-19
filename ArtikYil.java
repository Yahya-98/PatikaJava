import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int yil;
        yil = input.nextInt();

        if ((yil % 100 == 0) && (yil % 400 == 0)){ // önce 100 e ve 400 e bölümlerden kalanlar kontrol ediliyor
            System.out.println(yil + " bir artık yıldır");
        }else if ((yil % 4 == 0) && (yil % 100 != 0) && (yil% 400 != 0)){ // 100 e ve 400 e bölünmedigi ama 4 e bölündügü kontrol ediliyor
            System.out.println(yil + " bir artık yıldır");
        }else{
            System.out.println(yil + " artık yıl degildir");
        }



    }
}
