import java.util.Arrays;

public class DiziFrekans {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] count = new int[arr.length];
        System.out.println("Tekrar Sayıları");

        for(int i = 0; i < arr.length; i++){
            int counter = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == count[j]){break;} // eger daha önce sayildiysa tekrar sayilmasin
                if (arr[i] == arr[j]){ // frekans sayici
                    counter++;
                }
            }
            if( counter > 0){ // eger sayildiysa sonucu bastırsın
            System.out.println(arr[i] + "Sayısı " + counter + " kere tekrar edildi");}
            count[i] = arr[i];
        }
    }
}
