package java0804_jdbc;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WinUser extends Frame {
	public WinUser() {
		setSize(300, 400);
		setVisible(true);

		// this.addWindowListener(new UserAdaapter());

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	class UserAdaapter extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}

}

public class Java202_gui {

	public static void main(String[] args) {
		WinUser wu = new WinUser();

	}// end main()

}// end class