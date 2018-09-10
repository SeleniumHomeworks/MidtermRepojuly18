package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for (int i = 1; i<array.length; i++){
            for (int j=i; j>0; j--){
                if (array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
       for (int i =0; i<array.length; i++){
           for (int j=1; j<array.length-i;i++){
               if (array[j-1]>array[j]){
                   int temp = array[j-1];
                   array[j-1]= array[j];
                   array[j] = temp;
               }
           }
       }
        final long endTime = System.currentTimeMillis();
       final long executionTime = endTime - startTime;
       this.executionTime= executionTime;
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here

        

        return list;
    }
    

    public int [] quickSort(int [] array, int low, int high){
        int [] list = array;
        //implement here
        if (low<high){
            int next = partition(array, low, high);
            quickSort(array, low, next-1);
            quickSort(array, next+1, high);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    public int [] heapSort(int [] array){
       final long startTime =System.currentTimeMillis();
        int [] list = array;
        //implement here
        buildHeap(array);
        for(int i = array.length-1; i>=1;i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i,0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }


    public int [] bucketSort(int [] array){
       final long startTime= System.currentTimeMillis();
        int [] list = array;
        //implement here
        int maxVal = getMax(array);
        int[] bucket = new int[maxVal+1];
        for (int i =0; i<bucket.length; i++){
            bucket[i] = 0;
        }
        for (int i =0; i<array.length; i++){
            bucket[array[i]]++;
        }
        int outPos = 0;
        for (int i =0; i>bucket.length; i++){
            for (int j = 0;j<bucket[i]; i++){
                array[outPos++] =i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }




}

