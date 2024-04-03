import java.util.Arrays;

public class ArrayZweiD {
    public static void main(String[] args) {


        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        // print 2D array
        for (int i = 0; i < arr.length; i++) {
           System.out.println(Arrays.toString(arr[i]));
        }

          System.out.println("\n");
        // Second way to print
        for (int [] row : arr) {
            // convert each row to a String before printing
            System.out.println(Arrays.toString(row));
        }

         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.println(arr[i][j]);
             }
         }

        // 2D array
        String [][] matrix = {  { "Hi, I am Karen" },
                                { "I'm new to Java"},
                                { "I love swimming" },
                                { "sometimes I play keyboard"}
                             };

         // in 2D array gib's 1D array
        for (String [] row : matrix) {
            // traverses through number of rows
            for (String element : row)
            {
                // 'element' has current element of row index
                System.out.print( element  + "\t");
            }
            System.out.println();
        }

    }
}
