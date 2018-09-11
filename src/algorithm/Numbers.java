package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[10];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");


		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		//By following above, Continue for rest of the Sorting Algorithm....
         algo.insertionSort(num);
         long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("the total execution time" + num.length + "numbers in bubble sort takes : " + bubbleSortExecutionTime
		 + "mili secs");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");

		algo.quickSort(num, findLow(num), findHigh(num));
        long quickSortExecutionTime = algo.executionTime;
		System.out.println("total execution time " + num.length + " numbers in quick Sort takes:" + quickSortExecutionTime + " mili sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");

		randomize(num, n);
        algo.heapSort(num);
        long heapSortExecutationTime = algo.executionTime;
		System.out.println("total execution time " + num.length + " numbers in heap sort takes " + heapSortExecutationTime+ " mili sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");

		algo.bubbleSort(num);
		long bucketSortExcecutionTime  = algo.executionTime;
		System.out.println( "total execution time "+ num.length + "number in bucket sort takes " + bucketSortExcecutionTime + " mili sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");

		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		List<String> numbers3 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");

		for(String st:numbers3){
			System.out.println(st);
		}
		randomize (num, n);





		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static int findLow(int[]array){
		int low = array[0];
		for (int n : array){
			if (array[n]< low){
				low = array[n];
			}
		}
		return low;
	}

	public static int findHigh(int[]array){
		int high = array[0];
		for (int n : array){
			if (array[n]> high){
				high = array[n];
			}
		}
		return high;
	}



	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
