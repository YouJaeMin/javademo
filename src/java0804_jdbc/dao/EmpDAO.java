package java0804_jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java0804_jdbc.dto.EmpDTO;

public class EmpDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static EmpDAO dao = new EmpDAO();

	private EmpDAO() {
	}

	public static EmpDAO getInstance() {
		if (dao == null)
			dao = new EmpDAO();

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

	public ArrayList<EmpDTO> serchmethod(String serch) {
		ArrayList<EmpDTO> arr = new ArrayList<EmpDTO>();

		try {
			conn = init();

			String sql = "select employee_id, first_name, salary, hire_date from employees where lower(first_name) like ? order by employee_id";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + serch.toLowerCase() + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setHire_date(rs.getDate("hire_date"));
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
