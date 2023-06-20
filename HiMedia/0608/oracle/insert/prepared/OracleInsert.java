package oracle.insert.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleInsert {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##himedia";
		String password = "himedia";

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Oracle connection success.\n");
//			Statement stmt = conn.createStatement();

			int num = 40;
			String sql = "SELECT * FROM DEPT WHERE deptno=?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				ResultSet rs = pstmt.executeQuery();

				String ret1 = "", ret2 = "";
				while (rs.next()) {
//					System.out.print(rs2.getString("MAX(DEPTNO)") + " ");
					ret1 = rs.getString("DNAME");
					ret2 = rs.getString("LOC");

					System.out.println(ret1 + " " + ret2);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			// ------------------------------------------------------------------

//			int ideptret = Integer.parseInt(ret);
//			ideptret += 10;
//			iRet += 10;
//			System.out.println(iRet);
//			String strdept = Integer.toString(ideptret);
//			// -------------------------------------
//			String ideptno = strdept, sdname = "IT", sloc = "SEOUL";
//			String sql = "INSERT INTO dept VALUES('" + ideptno + "','" + sdname + "','" + sloc + "')";
//			System.out.println(sql);
//			boolean b = stmt.execute(sql);
//			if (!b) {
//				System.out.println("Insert success.\n");
//			} else {
//				System.out.println("Insert fail.\n");
//			}
//
//			String sql2 = "SELECT deptno, dname, loc FROM dept ORDER BY 1";
//			ResultSet rs = stmt.executeQuery(sql2);
//			while (rs.next()) {
//				System.out.print(rs.getString("deptno") + " ");
//				System.out.print(rs.getString("dname") + " ");
//				System.out.println(rs.getString("loc") + " ");
//			}
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver loading fail.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Oracle connection fail.");
			e.printStackTrace();
		}
	}
}
