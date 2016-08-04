package java0804_jdbc;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * JOptionPane을 통해 만들 수 있는 대화상자 메소드
 * 1 showInputDialog : 사용자로 부터 데이터를 입력 받기 위한 대화상자
 * 2 showMessageDialog : 사용자에게 메세지를 보여주는 대화상자
 * 3 showConfirmDialog : 사용자가 Yes, No등을 선택할 수 있는 대화상자
 * 4 showOptionDialog : 위 세가지를 포함한 대화상자
 * 
 * JOptionPane클래스에서 제공하는 전달인자
 * 1 Component ParentComponent : 대화상자를 소유하고 있는 부모컴포넌트
 * 2 Object message : 출력할 메세지
 * 3 String title : 제목줄에 보여줄 문자열
 * 4 int option : 대화상자에 보여줄 출력 옵션 버튼
 * 5 Icon icon : 대화상자 왼쪽에 보여줄 아이콘
 * 
 * Option Type Values(버튼모양)
 * 1 DEFAULT_OPTION
 * 2 YES_NO_OPTION
 * 3 YES_NO_CANCLE_OPTION
 * 4 OK_CANCEL
 * 
 * Icon Type Values(대화상자에 메세지와 함께 뜨는 아이콘)
 * 1 ERROR_MESSAGE
 * 2 INFORMATION_MESSAGE
 * 3 WARNING_MESSAGE
 * 4 QUESTION_MESSAGE
 * 5 PLAIN_MESSAGE
 */
class Pane extends JFrame {

	public Pane() {

		setSize(500, 500);
		setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Object[] options = { "OK", "CANCEL" };

				int key = JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

				// CLOSED_OPTION - 종료(X) 버튼으로 창을 닫은 경우. CANCEL / NO와 비슷하게
				// 처리해줘야합니다.
				// YES_OPTION - 예(YES) 버튼 선택시 리턴값
				// NO_OPTION - 아니오(NO) 버튼 선택시
				// CANCEL_OPTION - 취소(CANCEL) 버튼 선택시
				// OK_OPTION - 확인(OK) 버튼 선택시

				switch (key) {
				case JOptionPane.YES_OPTION:
					System.exit(0);
					break;
				case JOptionPane.CLOSED_OPTION:
				case JOptionPane.CANCEL_OPTION:
				case JOptionPane.NO_OPTION:

					break;

				}

			}
		});

	}

}

public class Java210_gui_Message {

	public static void main(String[] args) {
		new Pane();

	}// end main()

}// end class