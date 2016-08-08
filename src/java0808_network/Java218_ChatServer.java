package java0808_network;

import java.net.ServerSocket;
import java.net.Socket;

public class Java218_ChatServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(7777);

		while (true) {
			// 클라이언트 대기상태
			Socket cilent = server.accept();
			Java218_ChatHandler handler = new Java218_ChatHandler(cilent);
			System.out.println("cilent가" + cilent.getInetAddress().getHostAddress() + " 으로 접속하셨습니다.");
			handler.start();
		}

	}// end main()

}// end class