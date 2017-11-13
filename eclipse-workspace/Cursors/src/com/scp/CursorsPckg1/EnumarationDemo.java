package com.scp.CursorsPckg1;

import java.util.Enumeration;
import java.util.Vector;

			/*		Enumeration (I)
			 * 1. It is legacy from 1.0 version
			 * 2. Single Direction (Only Forward direction)
			 * 3. Read only Access
			 * 4. get from elements() method of vector class
			 * 5. Methods (i) hasMoreElements();
			 * 			  (ii) nextElements();
			 * */
public class EnumarationDemo {

	public static void main(String[] args) {
		Vector v = new Vector(); // Create a Object of Vector
		for (int i = 0; i <= 10; i++) {
			v.addElement(i); // Add Elements in Vector
		}
		System.out.println(v); // output [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		Enumeration e = v.elements(); // Enumeration Get from the elements method(v.elements();)of vector class
		while (e.hasMoreElements()) {
			Integer I = (Integer) e.nextElement();
			if (I % 2 == 0)
				System.out.println(I); // output 0 2 4 6 8 10
		}
		System.out.println(v); // output [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}

}
