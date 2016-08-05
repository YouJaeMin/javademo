package java0805_jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java0804_jdbc.dto.EmpDTO;
import java0805_jdbc.dto.EmployeesDTO;

public class EmployeesDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static EmployeesDAO dao = new EmployeesDAO();

	private EmployeesDAO() {
	}

	public static EmployeesDAO getInstance() {
		if (dao == null)
			dao = new EmployeesDAO();

		return dao;
	}

	private Connection init() throws SQLException, ClassNotFoundException {

		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";

		return DriverManager.getConnection(url, username, password);
	}

	private void stop() {

		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<EmployeesDTO> serchmethod(String serch) {
		ArrayList<EmployeesDTO> arr = new ArrayList<EmployeesDTO>();

		try {
			conn = init();

			String sql = "select employee_id, first_name, salary, department_id from employees where lower(first_name) like ? "
					+ " or to_char(employee_id) = ?"
					+ " order by employee_id";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + serch.toLowerCase() + "%");
			pstmt.setString(2, serch);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeesDTO dto = new EmployeesDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setDepartment_id(rs.getInt("department_id"));
				arr.add(dto);
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stop();
		}

		return arr;
	}

}
