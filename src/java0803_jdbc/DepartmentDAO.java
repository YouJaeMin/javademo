package java0803_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// Data Access Object(DAO) : 데이터 접근 객체

public class DepartmentDAO {
	Connection conn;
	Statement stmt;
	ResultSet rs;

	public DepartmentDAO() {

	}

	public ArrayList<DepartmentDTO> listMethod() {
		ArrayList<DepartmentDTO> aList = new ArrayList<DepartmentDTO>();

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. 서버연결
			String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);

			// 3. 쿼리문을 실행하기 위해 Statement타입의 객체를 리턴.
			stmt = conn.createStatement();
			String sql = "select * from departments order by department_id";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				DepartmentDTO dto = new DepartmentDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return aList;
	}

}// end class
