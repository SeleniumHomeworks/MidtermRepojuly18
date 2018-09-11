package string.problems;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("abc");



  }

        private static void permutation(String string){
        printPermutation(string , "");
        }

     private static void printPermutation(String string, String permutation){
        if (string.length()==0){
            System.out.println(permutation);
            return;
        }

            for (int i = 0; i< string.length(); i++){
            char toAppendToPermutation = string.charAt(i);
            String remaining = string.substring(0, i) + string.substring(i +1);

            printPermutation(remaining,permutation+ toAppendToPermutation);




        }
     }
}


