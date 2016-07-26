package java0726_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */
/*
 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 
 * 프로그램을 구현하시오.
 *  title             	publisher   writer     price
 	JSP Programming  	JSPPub     JSPExpert   21000
	Servlet Programming WeBBest 	GoodName	 20000
	JDBC Programming 	JDBCBest 	NaDo SQL 	30000
	SQL Fundmental 		SQLBest		 Na SQL 	47000
	Java Programming 	JavaBest	 Kim kava	 25000
 */
public class Prob001_LinkedList {

	public static void main(String[] args) {

		File file = new File("./src/java0726_collection/prob/booklist.txt");
		Scanner sc = null;

		LinkedList<Book> sList = new LinkedList<Book>();

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] arr = sc.nextLine().split("/");
				Book book = new Book(arr[0], arr[1], arr[2], arr[3]);
				sList.push(book);
			}

			System.out.printf("%-20s %-10s %-10s %-10s\n", "title", "publisher", "writer", "price");
			while (!sList.isEmpty()) {
				Book book = sList.pop();
				System.out.printf("%-20s %-10s %-10s %-10s\n", book.getTitle(), book.getPublisher(), book.getWriter(),
						book.getPrice());

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}// end main()

}// end class
