package com.scp.CursorsPckg1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorDemo {
		/*			Iterator(I)
		 * 	1.2 version
		 * 	only forward direction 
		 * 	methods
		 * 			- hasNext();
		 * 			- next();
		 * 			- remove();
		 * 	it get by using iterator() method of collection interface
		 * 	access both read and remove
		 * 
		 * */
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0; i<=10; i++)
		{
		l.add(i);
		}
		System.out.println(l);		// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		Iterator<Integer> itr = l.iterator(); //Iterator get by using iterator() method of collection interface
		while(itr.hasNext()) {		//method
			Integer I = (Integer)itr.next(); 
			if(I%2==0) {					// Condition for even Numbers
				System.out.println(I);		// output 0 2 4 6 8 10
				}
				else
				itr.remove();	//Remove remaining elements
		}
		System.out.println("After removing the other elements: " +l);
	}
	

}
