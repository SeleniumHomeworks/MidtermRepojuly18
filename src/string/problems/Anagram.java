package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
       checkAnagram("CAT", "ACT");
       checkAnagram("MARY", "ARMY");
    }
    public static void checkAnagram(String word, String Anagram){
        if (isAnagram(word, Anagram) ==true){
            System.out.println(Anagram + " is an anagram of "+ word);
        }else {
            System.out.println(Anagram + " is not anagram of  "+ word);
        }
    }
    private static boolean isAnagram(String word, String alfa){
        if(word.length() !=alfa.length()){
            return false;
        }
      char[] luis = word.toCharArray();
        for(char c : luis){
            int pointe = alfa.indexOf(c);
            if (pointe != -1){
                alfa = alfa.substring(0, pointe) + alfa.substring(pointe +1, alfa.length());
            }else{
                return false;
            }
        }return alfa.isEmpty();
    }
}

