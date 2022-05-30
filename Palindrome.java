import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kelimeyi giriniz : ");
        String letter = input.nextLine();
        int counter = 0;
        for (int i = 0; i < letter.length()/2; i++){
            if (letter.charAt(i) == letter.charAt(letter.length()-(i+1))){
                counter++;
            }
        }
        if(counter == (letter.length()/2)){
            System.out.println("Palindrome kelimedir.");
        }else {
            System.out.println("Palindrome kelime degildir.");
        }

    }
}
