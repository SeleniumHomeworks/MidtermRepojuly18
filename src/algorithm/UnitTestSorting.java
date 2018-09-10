package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        sort.insertionSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Insertion sort array is not unsorted");
        }catch (Exception ex){
            ex.getMessage();
        }
       sort.bubbleSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray,unSortedArray, "bubble sort array is not sorted" );
        }catch (Exception ex){
            ex.getMessage();
        }
    sort.mergeSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "merge sort array is not sorted");
        }catch (Exception ex){
            ex.getMessage();
        }
       sort.heapSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray," heap sort array is not sorted");
        }catch (Exception ex){
            ex.getMessage();

            sort.bucketSort(unSortedArray);
            try{
                Assert.assertEquals(sortedArray, unSortedArray, " bucket sort array is not sorted");
            }catch (Exception e){
                ex.getMessage();

                sort.getMax(unSortedArray);
                try{
                    Assert.assertEquals(unSortedArray, sortedArray, " getMax sort array is not sorted");
                }catch(Exception x){
                    ex.getMessage();
                }
            sort.shellSort(unSortedArray);
                try{
                    Assert.assertEquals(sortedArray, unSortedArray, " shell sort Array is not sorted");
                }catch(Exception a){
                    ex.getMessage();
                }

            }
        }
    }
}
