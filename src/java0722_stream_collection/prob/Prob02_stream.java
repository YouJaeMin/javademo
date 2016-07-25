package java0722_stream_collection.prob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * [문제]
 *  jumsu.txt 파일로부터 학생의 점수를 읽어들여 총점과 평균을 jumsu.txt 파일 끝에 덧붙여 출력하는 프로그램을 작성하시오.
    단, 평균점수는 소수점 첫 번째 자리까지만 남기고 나머지는 잘라낸다.(truncate) 
    
    [프로그램 실행결과]
    태연:65
	수영:97
	제시카:100
	티파니:86
	써니:88
	총점:436
	평균:87.2
 */
public class Prob02_stream {
	public static void main(String[] args) {
		// 프로그램을 구현하시오.
		File file = new File(".\\src\\java0722_stream_collection\\prob\\jumsu.txt");
		FileReader fr = null;
		LineNumberReader lnr = null;
		FileWriter fw = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			lnr = new LineNumberReader(fr);
			fw = new FileWriter(file, true);

			String line = "";
			int sum = 0;
			double avg = 0.0;
			while ((line = lnr.readLine()) != null) {
				String[] arr = line.split(":");
				sum += Integer.parseInt(arr[1]);
			}
			avg = sum / (double) lnr.getLineNumber();
			avg = Math.round(avg * 10) / 10.0;

			fw.write("총점 : " + sum + "\r\n");
			fw.write("평균 : " + avg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				lnr.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end main()
}// end class
