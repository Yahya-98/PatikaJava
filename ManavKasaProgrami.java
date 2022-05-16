import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double kg,
                armut = 2.14,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlican =5.0,
                res=0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç KG ? : ");
        kg = input.nextFloat();
        res += kg*armut;


        System.out.print("Elma Kaç KG ? : ");
        kg = input.nextFloat();
        res += kg*elma;

        System.out.print("Domates Kaç KG ? : ");
        kg = input.nextFloat();
        res += kg*domates;

        System.out.print("Muz Kaç KG ? : ");
        kg = input.nextFloat();
        res += kg*muz;

        System.out.print("Patlıcan Kaç KG ? : ");
        kg = input.nextFloat();
        res += kg*patlican;

        System.out.println("Toplam fiyat = " + res);









    }
}

