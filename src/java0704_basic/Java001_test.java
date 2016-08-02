package java0704_basic;

public class Java001_test {

	public static void main(String[] args) {
		System.out.println("java start");
		
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		String s1 = new String("test");
		String s2 = "test";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		
		
	}
	
}