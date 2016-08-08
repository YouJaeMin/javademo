package java0808_network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 소켓 프로그래밍 : 소켓을 이용한 통신 프로그래밍을 의미한다.
 * 소켓(socket) : 프로세스간의 통신에 사용되는 양쪽 끝단을 의미한다.
 *               서로 멀리 떨어진 두 사람이 통신하기 위해서 전화기가
 *               필요한 것처럼, 프로세스간의 통신을 위해서는 소켓이 필요하다.

 * 클라이언트 : IP와 포트번호를 가지고 연결한다.
 *                
 */
public class Java217_ClientSocket {

	public static void main(String[] args) {

		try {

			Socket socket = new Socket("127.0.0.1", 7777);

			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			ow.write("정보요청");
			ow.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end main()

}// end class