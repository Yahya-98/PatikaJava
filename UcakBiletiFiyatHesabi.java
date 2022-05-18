import java.util.Scanner;
public class UcakBiletiFiyatHesabi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mesafe, yas, seyahatTipi;
        double fiyat,indirimliFiyat;

        System.out.print("Mesafayi KM türünden giriniz: ");
        mesafe = input.nextInt();
        if (mesafe <=0){
            System.out.println("Mesafe degeri yanlis girildi 0 dan büyük deger giriniz.");
        }
        System.out.print("Yasinizi giriniz: ");
        yas = input.nextInt();
        if (yas <= 0){
            System.out.println("Yas degeri yanlis girildi, yas 0 dan büyük olmalidir.");
        }
        System.out.print("Yolculuk tipini giriniz 1 => Tek yön 2 => Gidis Dönüs");
        seyahatTipi = input.nextInt();

        fiyat = mesafe * 0.10;
        System.out.println("Normal Tutar = " + fiyat);
        if (yas <= 12 && seyahatTipi == 1){
            fiyat *= 0.5;
            System.out.print("Indirimli tutar = " + fiyat);
        }else if(yas <= 12 && seyahatTipi == 2){
            fiyat *= 0.8;
        }
        if ((yas > 12 && yas < 24)&& seyahatTipi == 1){
            fiyat *= 0.9;
        }else if((yas > 12 && yas < 24) && seyahatTipi == 2){
            fiyat *= 2;
            fiyat *= 0.8;
            fiyat *= 0.9;

        }
        if (yas > 65 && seyahatTipi == 1){
            fiyat *= 0.7;
        }else if (yas > 65 && seyahatTipi == 2){
            fiyat *= 2;
            fiyat *= 0.8;
            fiyat *= 0.7;
        }
        System.out.print("Indirimli Fiyat = " + fiyat);

    }
}


