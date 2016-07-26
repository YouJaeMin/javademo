package java0726_collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/*
 * Hashtable
 * 1 Map인터페이스를 구현해놓은 클래스
 * 2 Map인터페이스를 구현해 놓은 클래스들은 key, value쌍으로 저장한다.
 * 3 value을 구분해주는 것은 key이므로 key은 중복이 되면 안된다.
 */
public class Java185_Hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(10, "java");
		ht.put(20, "jsp");
		ht.put(30, "spring");
		System.out.println(ht.get(20));

		/*
		 * Enumeration(열거형) : Vector, Hashtable에서만 제공한다. Iterator(반복자) : Vector,
		 * Hashtable외에 다른 컬렉션에서도 Enumeration와 같은 기능을 제공할 수 있도록 제공해줬다.
		 * 
		 */
		System.out.println("Enumeration=============");
		Enumeration<Integer> et = ht.keys();
		while (et.hasMoreElements()) {
			Integer key = et.nextElement();
			System.out.printf("%d:%s\n", key, ht.get(key));

		}

		System.out.println("Iterator=============");
		// 바로 연결이 되지 않아 Set에서 지원하는 iterator을 연결
		Iterator<Integer> rt = ht.keySet().iterator();
		while (rt.hasNext()) {
			Integer k = rt.next();
			System.out.printf("%d:%s\n", k, ht.get(k));
		}

	}// end main()

}// end class
