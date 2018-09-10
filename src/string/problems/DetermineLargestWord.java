package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        int largestW = 0;
        String LargestValue= "";
        for (Map.Entry<Integer, String> checkL : wordNLength.entrySet()){
            if (largestW< checkL.getKey()){
                largestW = checkL.getKey();
                LargestValue = checkL.getValue();
            }

        }
        System.out.println("largest word : " + LargestValue + " lenght = " + largestW);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String [] splitt = wordGiven.split(" ");
        for (int x= 0; x<splitt.length; x++){

            map.put(splitt[x].length(), splitt[x]);
        }

        return map;
    }
}
