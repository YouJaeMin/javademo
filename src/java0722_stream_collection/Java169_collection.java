package java0722_stream_collection;

import java.util.Vector;

public class Java169_collection {
	public static void main(String[] args) {

		Vector v = new Vector();
		// Integer > Object (업캐스팅)
		v.addElement(new Integer(10)); // 0
		v.addElement(new Integer(20)); // 1
		v.addElement(new Integer(30)); // 2

		int num = 40;
		// int > Integer > Object (auto boxing > upcasting)
		v.addElement(num); // 3

		// Object > Integer (다운캐스팅)
		Integer it = (Integer) v.get(0);
		System.out.println(it);

		// Object > Integer > int (downcastion > outo unboxing)
		int a = (Integer) v.get(3);
		System.out.println(a);
		
		
		
		
	}// end main()

}// end class
