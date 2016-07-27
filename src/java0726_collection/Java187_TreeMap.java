package java0726_collection;

import java.util.Iterator;
import java.util.TreeMap;

/*
 * TreeMap
 * 1 Map인터페이스를 구현한 클래스
 * 2 정렬을 제공해주는 클래스
 */
public class Java187_TreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(10, "java");
		tm.put(30, "JSP");
		tm.put(20, "spring");

		System.out.println(tm);

		Iterator<Integer> it = tm.keySet().iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			System.out.printf("%d:%s\n",key,tm.get(key));
		}
		
		it = tm.descendingKeySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.printf("%d:%s\n",key,tm.get(key));
		}
		

	}// end main()

}// end class
