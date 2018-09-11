package datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		File file = new File(textFile);
		BufferedReader br = null;
		String Line = "";
		String Store = "";
		try{
            FileReader fr = new FileReader(textFile);
            br = new BufferedReader(fr);

            while ((Line = br.readLine()) !=null){
                Store+= Line;
            }

        }catch (IOException ex){
            ex.printStackTrace();

	}
	String[] storeArray = Store.split( " ");
        List<String> storeList = new LinkedList<>();
        Stack<String> storeStack = new Stack<>();

        for (String element : storeArray){
            storeList.add(element);
            storeStack.push(element);
        }
        System.out.println("\n\nLinkedlist LIFO :");
        Iterator<String> it = storeList.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+ " ");
        }
        System.out.println("\n\nStack LIFO: ");

        while (!storeStack.isEmpty()){

            System.out.println(storeStack.pop()+ " ");
        }



	}

}