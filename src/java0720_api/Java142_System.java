package java0720_api;

public class Java142_System {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 3, 4 };
		int[] arr2 = { 6, 3, 9, 7, 8 };
		int[] arr3 = process(arr1, arr2);

		for (int i : arr3) {
			System.out.printf("%3d", i);
		}

	}// end main()

	public static int[] process(int[] arr1, int[] arr2) {

		int[] arr3 = new int[arr1.length + arr2.length];

		// for (int i = 0; i < arr3.length; i++) {
		// if (i < arr1.length) {
		// arr3[i] = arr1[i];
		// } else {
		// arr3[i] = arr2[i - arr1.length];
		// }
		// }

		// src, srcPos, dest, destPos, length
		// 복사할것, 시작위치, 복사할곳, 시작위치, 길이복사(갯수)
		// FIXME 배열 합치기
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

		return arr3;
	}

}// end class
