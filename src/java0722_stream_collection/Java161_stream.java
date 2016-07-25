package java0722_stream_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

//FIXME 파일
public class Java161_stream {

	public static void main(String[] args) {
		FileReader fr = null;
		LineNumberReader lnr = null;
		try {
			fr = new FileReader("./src/java0722_stream_collection/score.txt");
			// 라인번호를 출력할 수 있는 메소드를 제공해주는 스트림이다.
			lnr = new LineNumberReader(fr);
			String line = "";

			while ((line = lnr.readLine()) != null) {
				System.out.printf("%d : %s\n", lnr.getLineNumber(), line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				lnr.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end main()

}// end class
