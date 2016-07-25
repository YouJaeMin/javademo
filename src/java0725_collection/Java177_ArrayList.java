package java0725_collection;

import java.util.ArrayList;

public class Java177_ArrayList {
	public static void main(String[] args) {

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		String[] arr = display(aList);

		for (String data : arr) {
			System.out.println(data);
		}

	}// end main()

	public static String[] display(ArrayList<String> aList) {
		String[] arr = new String[aList.size()];
		for (int i = 0; i < aList.size(); i++) {
			arr[i] = aList.get(i);
		}

		String[] arr1 = new String[aList.size()];
		aList.toArray(arr1);
		for (String string : arr1) {
			System.out.println(string);
		}

		Object[] obj = aList.toArray();
		String[] sarr = new String[obj.length];
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = (String) obj[i];
			System.out.println(sarr[i]);
		}

		return arr;
	}

}// end class
