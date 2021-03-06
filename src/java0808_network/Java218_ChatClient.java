package java0808_network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Java218_ChatClient implements WindowListener, ActionListener, Runnable {

	private String host;
	private int port;
	private String userName;

	private JFrame frm;
	private JPanel pan;
	private JTextArea taOutput;
	private JLabel lbName;
	private JTextField tfInput;
	private JScrollPane scroll;

	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	private Thread listener;

	public Java218_ChatClient(String host, int port) {
		System.out.println("사용자 이름을 입력하세요 : ");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader out = new BufferedReader(in);

		try {
			userName = out.readLine();
		} catch (IOException e) {
			userName = "guest";
		}
		this.host = host;
		this.port = port;
		initComponent();
	}

	private void initComponent() {
		frm = new JFrame("채팅 프로그램 [" + host + ":" + port + "]");

		taOutput = new JTextArea();
		taOutput.setEditable(false);

		tfInput = new JTextField(10);
		pan = new JPanel();
		lbName = new JLabel("입력 :");

		scroll = new JScrollPane(taOutput);
		scroll.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				JScrollBar src = (JScrollBar) e.getSource();
				src.setValue(src.getMaximum());
			}
		});

		frm.add("Center", scroll);
		frm.add("South", pan);

		pan.setLayout(new BorderLayout());
		pan.add(lbName, BorderLayout.WEST);
		pan.add(tfInput, BorderLayout.CENTER);
		frm.setSize(300, 400);
		frm.setVisible(true);

		frm.addWindowListener(this);
		tfInput.addActionListener(this);
	}

	public String getUserName() {
		return this.userName;
	}

	// 서버연결 및 입출력 스트림 연결
	public void start() {
		if (listener == null) {
			try {
				Socket socket = new Socket(host, port);
				dataIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				dataOut = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		listener = new Thread(this);
		listener.start();
		frm.setVisible(true);

	}

	public void stop() {
		hanStop();
		if (listener != null) {
			listener.interrupt();
			listener = null;
			try {
				dataOut.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			frm.setVisible(false);
			frm.dispose();
			System.exit(0);
		}
	}

	public void hanStop() {
		System.out.println("testststst");
		Enumeration<Java218_ChatHandler> enu = Java218_ChatHandler.handlers.elements();
		while (enu.hasMoreElements()) {
			Java218_ChatHandler handler = enu.nextElement();
			try {
				handler.listener = null;

				handler.dataIn.close();
				handler.dataOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		Java218_ChatClient client = new Java218_ChatClient("192.168.10.120", 7777);
		client.start();
	}// end main()

	@Override
	public void actionPerformed(ActionEvent e) {
		String message = e.getActionCommand();
		try {
			dataOut.writeUTF(getUserName() + ":" + message);
			dataOut.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		tfInput.setText("");

	}

	@Override
	public void run() {
		System.out.println("메세지 수신 대기 중\n");
		while (!Thread.interrupted()) {
			try {
				String line = dataIn.readUTF();
				taOutput.append(line + "\n");
				System.out.println("server>" + line + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		stop();

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}// end class