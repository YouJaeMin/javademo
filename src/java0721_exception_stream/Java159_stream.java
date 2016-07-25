package java0721_exception_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
* Enter의 기능 1번후2번 유니코드값
* 1. carriage return : 줄의 처음으로 이동(13) - \r
* 2. line feed : 다음 줄로 이동(10) - \n
*/
public class Java159_stream {

	public static void main(String[] args) {

		File file = new File("sample.txt");
		// System.out.println(file.exists());
		// System.out.println(file.isFile());
		// System.out.println(file.canWrite());
		FileWriter fw = null;
		try {
			/*
			 * FileWriter("대상파일", mode) mode의 값이 true이면 append이고, fasle이면
			 * update이다. 생략하면 mode의 값은 false이다. (기본값)
			 */
			fw = new FileWriter(file, false);
			fw.write("java\r\n"); // buffer
			// fw.flush(); // buffer의 내용을 대상 file에 보내고 buffer를 clear한다.
			fw.write("test\r\n");
			fw.write(97);
			fw.write(10);

			System.out.println("저장종료");
			// fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // flush()후 close()
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end main()

}// end class
