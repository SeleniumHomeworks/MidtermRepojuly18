package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int next = 0;
        int prev = 1;
        for(int i =0; i <41; i++){
            System.out.println(next);
            next = next+ prev;
            prev = next - prev;
        }

    }
}
