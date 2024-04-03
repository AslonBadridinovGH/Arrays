import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        int[] array1 = new int[10];


        array1[0] = 0;
        array1[1] = 1;
        array1[2] = 2;
        array1[3] = 3;
        array1[4] = 4;
        array1[5] = 5;
        array1[6] = 6;
        array1[7] = 7;
        array1[8] = 8;
        array1[9] = 9;

        // Step 2
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println(sum);

        // Step 3
        int max = array1[0];

        for (int j : array1) {

            if (j > max) {

                max = j;
            }
        }
        System.out.println(max);


        // Step 4
        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


        // Step 5
        int[] array3 = new int[10];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.println(array3[i]);
        }


        // bonus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        for(int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

    }

}


