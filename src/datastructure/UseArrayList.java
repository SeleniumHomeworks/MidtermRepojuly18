package datastructure;

import databases.ConnectToMongoDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> car = new ArrayList<>();
		car.add("Chevy");
		car.add("ford");
		car.add("benz");
        System.out.println(" values of arrayList = "+ car);
        for (int x =1;x<3;x++){
            System.out.println("sepecified fron index to index =" + car.get(x));
        }
        Iterator<String> it = car.iterator();
        System.out.println(it.next());
        System.out.println(it.hasNext());
        while (it.hasNext())
            System.out.println("from while loop : " + it.next());
        for (Object y : car){
            System.out.println(y);
        }

        /*ConnectToMongoDB connect = new ConnectToMongoDB();
        connect.insertIntoMongoDB(student, "car");*/
	}

}
