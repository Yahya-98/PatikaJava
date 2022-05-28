import java.util.Scanner;
public class YakinDeger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = {15,12,788,1,-1,-778,2,0};

        System.out.print("Dizi : ");

        for(int i : list){
            System.out.print(i + " " );
        }

        System.out.print("\nGirilen Sayı : ");

        int number = input.nextInt();

        int min = list[0];
        int max = list[0];
        int tmp = number;
        int tmp1 = number;

        for(int i : list){   // en kücük deger bulunur tmp ye atilir
            if (i < min ){
                tmp = i;
            }
        }
        for(int i = 0; i < list.length;i++){
            if (list[i] < number && ( number - list[i] <= number - tmp )) { // girilen degerden kücük ve girilen deger ile arasindaki fark en kücük olan bulunur
                min = list[i];
                tmp = min;
            }
            if(list[i] > max){
                tmp1 = list[i];
            }
        }

        for(int i = 0; i < list.length; i++){
            if(list[i] > number && ( list[i] - number <= tmp1 - number)){ // girilen degerden büyük ve tmp ile girilen deger arasındaki fark en kücük olan bulunur
                max = list[i];
                tmp1 = max;
            }
        }

        System.out.println("min : " + min + " max : " +max);




    }

}
