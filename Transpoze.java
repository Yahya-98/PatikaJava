public class Transpoze {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},{4, 5, 6}};

        int[][] transpoze = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr.length; j++){
                transpoze[i][j] = arr[j][i];  // transpoz islemi
            }
        }

        for(int i = 0; i < transpoze.length; i++){ // printer
            for(int j = 0; j < transpoze[i].length; j++){
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println(" ");
        }



    }


}
