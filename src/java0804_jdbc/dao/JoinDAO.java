package java0804_jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java0803_jdbc.DepartmentDAO;
import java0804_jdbc.dto.DepartmentsDTO;
import java0804_jdbc.dto.EmpDTO;
import java0804_jdbc.dto.EmployeesDTO;
import java0804_jdbc.dto.LocationsDTO;

public class JoinDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static JoinDAO dao = new JoinDAO();

	private JoinDAO() {
	}

	public static JoinDAO getInstance() {
		if (dao == null)
			dao = new JoinDAO();
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

	public ArrayList<EmployeesDTO> listMethod() {
		ArrayList<EmployeesDTO> aList = new ArrayList<EmployeesDTO>();

		try {
			conn = init();
			stmt = conn.createStatement();
			String sql = "select e.employee_id, e.first_name, e.salary," + "d.department_id, d.department_name,"
					+ "l.location_id, l.city" + " from employees e, departments d, locations l"
					+ " where e.department_id = d.department_id" + " and d.location_id=l.location_id";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				EmployeesDTO edto = new EmployeesDTO();
				edto.setEmployee_id(rs.getInt("employee_id"));
				edto.setFirst_name(rs.getString("first_name"));
				edto.setSalary(rs.getInt("salary"));

				DepartmentsDTO ddao = new DepartmentsDTO();
				ddao.setDepartment_id(rs.getInt("department_id"));
				ddao.setDepartment_name(rs.getString("department_name"));
				edto.setMdto(ddao);

				LocationsDTO ldto = new LocationsDTO();
				ldto.setCity(rs.getString("city"));
				ldto.setLocation_id(rs.getInt("location_id"));
				edto.setLdto(ldto);

				aList.add(edto);
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return aList;
	}

}
