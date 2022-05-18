import java.util.Scanner;
public class BurcHesabi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ay, gün;

        System.out.print("Önce ay sonra gün giriniz: ");
        ay = input.nextInt();
        gün = input.nextInt();

        if (ay == 3  || ay == 4) {
            if (ay == 3 && gün >= 21) {
                System.out.print("Koç Burcusunuz");
            } else if (ay == 4 && gün <= 20) {
                System.out.print("Koç Burcusunuz");
            }
        }
        if (ay == 4  || ay == 5) {
            if (ay == 3 && gün >= 21) {
                System.out.print("Boğa Burcusunuz");
            } else if (ay == 5 && gün <= 21) {
                System.out.print("Boğa Burcusunuz");
            }
        }
        if (ay == 5  || ay == 6) {
            if (ay == 5 && gün >= 22) {
                System.out.print("İkizler Burcusunuz");
            } else if (ay == 6 && gün <= 22) {
                System.out.print("İkizler Burcusunuz");
            }
        }
        if (ay == 6  || ay == 7) {
            if (ay == 6 && gün >= 23) {
                System.out.print("Yengeç Burcusunuz");
            } else if (ay == 7 && gün <= 22) {
                System.out.print("Yengeç Burcusunuz");
            }
        }
        if (ay == 7  || ay == 8) {
            if (ay == 7 && gün >= 23) {
                System.out.print("Aslan Burcusunuz");
            } else if (ay == 8 && gün <= 22) {
                System.out.print("Aslan Burcusunuz");
            }
        }
        if (ay == 8  || ay == 9) {
            if (ay == 8 && gün >= 23) {
                System.out.print("Başak Burcusunuz");
            } else if (ay == 9 && gün <= 22) {
                System.out.print("Başak Burcusunuz");
            }
        }
        if (ay == 9  || ay == 10) {
            if (ay == 9 && gün >= 23) {
                System.out.print("Terazi Burcusunuz");
            } else if (ay == 10 && gün <= 22) {
                System.out.print("Terazi Burcusunuz");
            }
        }
        if (ay == 10  || ay == 11) {
            if (ay == 10 && gün >= 23) {
                System.out.print("Akrep Burcusunuz");
            } else if (ay == 11 && gün <= 21) {
                System.out.print("Akrep Burcusunuz");
            }
        }
        if (ay == 11  || ay == 12) {
            if (ay == 11 && gün >= 22) {
                System.out.print("Yay Burcusunuz");
            } else if (ay == 12 && gün <= 21) {
                System.out.print("Yay Burcusunuz");
            }
        }
        if (ay == 12  || ay == 1) {
            if (ay == 12 && gün >= 22) {
                System.out.print("Oğlak Burcusunuz");
            } else if (ay == 1 && gün <= 21) {
                System.out.print("Oğlak Burcusunuz");
            }
        }
        if (ay == 1  || ay == 2) {
            if (ay == 1 && gün >= 22) {
                System.out.print("Kova Burcusunuz");
            } else if (ay == 2 && gün <= 19) {
                System.out.print("Kova Burcusunuz");
            }
        }
        if (ay == 2  || ay == 3) {
            if (ay == 2 && gün >= 20) {
                System.out.print("Balık Burcusunuz");
            } else if (ay == 3 && gün <= 20) {
                System.out.print("Balık Burcusunuz");
            }
        }
}
}
