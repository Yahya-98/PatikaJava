import java.util.Scanner;
public class UserEnter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username,password,password2;
        int repasword;


        System.out.print("Username giriniz: ");
        username = input.nextLine();

        System.out.print("Pasword giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Hos geldiniz");
        }
        else{
            System.out.println("Bilgileriniz Yanlis !\n Sifrenizi sıfırlamak istiyorsanız 1 e basiniz");
        }
        repasword = input.nextInt();
        input.nextLine();

        if (repasword == 1) {
            System.out.print("Yeni sifrenizi giriniz: ");
            password2 = input.nextLine();
            if (password2.equals("java123")) {
                System.out.print("Yeni sifreniz eskisi ile ayni olamaz");
            }
            else{
                System.out.print("Yeni sifreniz olusturuldu");
            }
        }

    }
}
