package java0721_exception_stream;

import java.io.IOException;
import java.io.InputStream;

/*
 * Enter의 기능 1번후2번 유니코드값
 * 1. carriage return : 줄의 처음으로 이동(13)
 * 2. line feed : 다음 줄로 이동(10)
 * 
 * InputStream read()한바이트씩 읽어온다.
 */
public class Java155_stream {

	public static void main(String[] args) {
		InputStream is = System.in;
		System.out.print("이름: ");
		int data;

		try {
			while ((data = is.read()) != 10) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end main()

}// end class
