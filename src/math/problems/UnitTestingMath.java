package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Assert.assertEquals(9591,PrimeNumber.isPrime(9591));

        int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
       // Assert.assertEquals(5,LowestNumber.);

        int [] array2 = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Assert.assertEquals(9,FindMissingNumber.sumOfArrayForMissingNumber(array2));

        int [] array3 = {30,12,5,9,2,20,33,1};
        int [] array4 = {18,25,41,47,17,36,14,19};
      //  Assert.assertEquals(1,FindLowestDifference.(array3,array4));

        Assert.assertEquals(120,Factorial.fact(5));
        Assert.assertEquals(120,Factorial.fact(5));
    }
}
