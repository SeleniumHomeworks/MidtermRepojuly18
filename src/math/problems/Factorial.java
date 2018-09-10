package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
   int X = 5;
   long result = fact (X);
        System.out.println(result);
    }
   public static long fact(int X){
        if (X ==0)
            return 1;
        else return X*fact(X-1);
}

}
