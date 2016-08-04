package java0804_jdbc;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WinView extends Frame {

	public WinView() {

		setSize(300, 400); // 가로 300, 세로 400
		setVisible(true);
		// 이벤트가 발생된 컴포넌트.addWindowListener(이벤트리스너)
		this.addWindowListener(new Close());
		/*
		 * window 컴포너트에서 이벤트 발생 WindowEvent -> WinddowListener ->
		 * addWindowListener();
		 * 
		 * Button 컴포넌트에서 이벤트발생 ActionEvent -> ActionListener ->
		 * addActionListener();
		 * 
		 * 
		 */

	}

	class Close implements WindowListener {

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0); // 시스템 종료

		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub

		}

	}

}

public class Java201_gui {

	public static void main(String[] args) {
		WinView wn = new WinView();

	}// end main()

}// end class