package java0805_jdbc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java0805_jdbc.dao.EmployeesDAO;
import java0805_jdbc.dto.EmployeesDTO;

class DesignTest extends JFrame implements ActionListener, MouseListener {

	JTextField inputTxt;
	JButton searchBtn;
	JTable table;
	DefaultTableModel model;

	public DesignTest() {

		inputTxt = new JTextField(20);
		searchBtn = new JButton("검색");

		JPanel jp = new JPanel();
		jp.add(inputTxt);
		jp.add(searchBtn);

		// 테이블 헤드
		Object[] obj = { "사원번호", "사원명", "급여", "부서번호" };
		model = new DefaultTableModel(obj, 0) {
			// 셀 편집 불가능
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table = new JTable(model);
		// 컬럼이동 불가능
		table.getTableHeader().setReorderingAllowed(false);
		// 라인의 높이
		table.setRowHeight(20);

		add(BorderLayout.NORTH, jp);
		add(BorderLayout.CENTER, new JScrollPane(table));

		searchBtn.addActionListener(this);
		searchBtn.addMouseListener(this);

		inputTxt.addActionListener(this);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (model.getRowCount() != 0) {
			model.setRowCount(0);
		}

		EmployeesDAO dao = EmployeesDAO.getInstance();
		ArrayList<EmployeesDTO> arr = dao.serchmethod(inputTxt.getText());

		for (EmployeesDTO dto : arr) {
			Object[] dtoarr = { dto.getEmployee_id(), dto.getFirst_name(), dto.getSalary(), dto.getDepartment_id() };
			model.addRow(dtoarr);
		}

		inputTxt.setText("");
		inputTxt.requestFocus();
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		searchBtn.setText("Search");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		searchBtn.setText("검색");
	}

}

public class Java212_gui {

	public static void main(String[] args) {
		new DesignTest();
	}// end main()

}// end class