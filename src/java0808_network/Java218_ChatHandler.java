package java0808_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

public class Java218_ChatHandler implements Runnable {
	Socket socket;
	DataInputStream dataIn;
	DataOutputStream dataOut;
	Thread listener;

	public static Vector<Java218_ChatHandler> handlers = new Vector<Java218_ChatHandler>();

	public Java218_ChatHandler(Socket socket) {
		this.socket = socket;
	}

	public void start() {
		try {
			dataIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			dataOut = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));

			listener = new Thread(this);
			listener.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		// Vector 에 현재 서버에 접속한 클라이언트 정보 저장
		handlers.addElement(this);

		while (!Thread.interrupted()) {
			try {
				String message = dataIn.readUTF();
				boradcast(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 현재 서버에 접속된 클라이언트 들에게 메시지 발송
	public void boradcast(String message) {
		synchronized (handlers) {
			Enumeration<Java218_ChatHandler> enu = handlers.elements();
			while (enu.hasMoreElements()) {
				Java218_ChatHandler handler = enu.nextElement();
				try {
					handler.dataOut.writeUTF(message);
					handler.dataOut.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}// end class