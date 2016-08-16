package java0803_jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import java0803_jdbc.dto.MemDTO;
/*
 * 1.ClassNotFoundException 
 *  해결)JRE System Library에서 ojdbc14.jar파일 확인
 *  
 * 2.java.sql.SQLException: IO 예외 상황: The Network Adapter ... 
 *   Listener refused....
 *   제어판->관리도구->서비스->OracleServiceXE 하고 OracleXETNSListener을 시작한다. 
 * 
 * 3. java.sql.SQLException: ORA-XXXX
 *   쿼리문을 확인
 *   
 */

/*
 * java.sql.PreparedStatement
 * 1 반복되는 쿼리문의 수행에 사용한다.
 * 2 미리 정의된 SQL문을 수행하기 때문에 Statement에 비해 속도가 빠르다.
 * 3 위치표시자(placeholder)(?)를 사용하여 쿼리문을 간략하게 작성한다.
 */
public class MemDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static MemDAO dao = new MemDAO();

	private MemDAO() {

	}

	public static MemDAO getinstance() {
		if (dao == null) {
			dao = new MemDAO();
		}
		return dao;
	}

	private Connection init() throws ClassNotFoundException, SQLException {

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

	public ArrayList<MemDTO> listMethod() {
		ArrayList<MemDTO> aList = new ArrayList<MemDTO>();

		try {
			conn = init();

			String sql = "select * from mem order by num";
			// pstmt = conn.prepareStatement(sql);
			// rs = pstmt.executeQuery();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				MemDTO dto = new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stop();
		}

		return aList;
	}

	public ArrayList<MemDTO> listMethod(String str) {
		ArrayList<MemDTO> aList = new ArrayList<MemDTO>();

		try {
			conn = init();

			String sql = "select * from mem where name like ? order by num";

			// String sql = "select * from mem where name like '%" + str + "%'
			// order by num";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + str + "%");
			rs = pstmt.executeQuery();
			// stmt = conn.createStatement();
			// rs = stmt.executeQuery(sql);

			while (rs.next()) {
				MemDTO dto = new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stop();
		}

		return aList;
	}

	public void insertmethod(MemDTO dto) {

		try {
			conn = init();
			// stmt = conn.createStatement();
			// // insert into mem values(mem_num_seq.nextval, '홍길동',30,'서울');
			// String sql = "insert into mem(num, name, age, loc)
			// values(mem_num_seq.nextval,'" + dto.getName() + "',"
			// + dto.getAge() + ",'" + dto.getLoc() + "')";
			// stmt.executeUpdate(sql);

			String sql = "insert into mem values(mem_num_seq.nextval,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stop();
		}

	}

	// FIXME 장바구니, 결제 할때 쓸수있다.
	public int insertmethod(ArrayList<MemDTO> list) {

		int cnt[] = null;
		try {
			conn = init();

			String sql = "insert into mem(num, name, age, loc) values(mem_num_seq.nextval,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			for (int i = 0; i < list.size(); i++) {
				MemDTO dto = list.get(i);
				pstmt.setString(1, dto.getName());
				pstmt.setInt(2, dto.getAge());
				pstmt.setString(3, dto.getLoc());
				pstmt.addBatch();
			}
			cnt = pstmt.executeBatch();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stop();
		}
		return cnt.length;
	}

	public void updateMethod(HashMap<String, Object> map) {

		try {
			conn = init();
			String sql = "update mem set name=? where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String) map.get("name"));
			pstmt.setInt(2, (Integer) map.get("num"));
			pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stop();
		}

	}

	public void deleteMethod(int num) {

		try {
			conn = init();
			String sql = "delete from mem where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stop();
		}

	}

}// end class
