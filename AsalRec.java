import java.util.Scanner;
public class AsalRec {

        static boolean isPrime(int number,int index){
            if(number<=2){
                return (number==2)?true:false;
            }
            if(number % index==0){
                return false;
            }
            if(index*index>number){
                return true;
            }
            return isPrime(number,index+1);
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Sayı giriniz: ");
            int number=input.nextInt();
            if(isPrime(number,2)){
                System.out.println(number+" sayısı asaldır!");
            }else{
                System.out.println(number+" sayısı  asal değildir!");
            }

        }
}
