import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a , b , c, tmp;
        System.out.println("A, B, C sayilarini giriniz");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();


       if ((a < b ) && (a < c)){
           if(b < c){
               System.out.print("A < B < C");
           }else{
               System.out.print("A < C <B");
           }
       }else if((b < a) && (b < c)){
           if (a < c){
               System.out.print("B < A < C");
           }else{
               System.out.print("B < C < A");
           }
       }else{
           System.out.print("C < B < A");
       }
    }
}
