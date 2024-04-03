import java.lang.reflect.Array;

public class myJava {
    public static void main(String[] args) {

        System.out.println(add(5, 6));
        System.out.println(add(5.12,  6.15));
        System.out.println(subtract(5.12,  6.15));
        System.out.println(makePositive(-5));

        System.out.println(checkNumbers(15));
        System.out.println(isPalindrome("ollo"));
        System.out.println(isReverse("ollo"));


        // Bonus
        int a = 10, b = 8;
        if(a>b){
            System.out.println(subtract(a,  b));
        }
    }

    public static int add(int num1,int num2) {

         int sum = num1+num2;
         return sum;
    }
    public static double add(double num1, double num2) {

         double sum = num1 + num2;
         return sum;
    }
    public static double subtract(double num1, double num2) {

         double result = num1 - num2;
         return result;
    }
    public static double makePositive(int num1) {

        if(num1>0){
            return num1;
        }else {
            return -num1;
        }

    }

    // Bonus
    public static int checkNumbers(int a) {

       if (a%2==0){
           return a;
       }else {
          return 2*a;
       }
    }

    public static boolean isPalindrome(String args) {

      boolean palindrome = true;

        int n = args.length();

        for (int i = 0; i < n/2 ; i++) {

                if (args.charAt(i) != args.charAt(n-i-1)){
                    palindrome = false;
                }

        }
         return palindrome;
    }

    public static boolean isReverse(String args) {

        return new StringBuilder(args).reverse().toString().equals(args);

    }
}

