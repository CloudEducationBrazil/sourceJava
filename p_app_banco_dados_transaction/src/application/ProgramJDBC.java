package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class ProgramJDBC {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		// Consulta BD: Connection; Statement; ResultSet
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("update seller set BaseSalary = 2090 where DepartmentId = 1");
			
			int x = 1;
			if ( x < 2 ) {
				throw new SQLException("Error Fake");
			}
			
			int rows2 = st.executeUpdate("update seller set BaseSalary = 3090 where DepartmentId = 2");
			
			conn.commit();
			
			System.out.println(rows1);
			System.out.println(rows2);
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back!!! Caused by: " + e.getMessage());
			}
			catch (Exception e2) {
				throw new DbException("Error trying to rollback!!! Caused by: " + e2.getMessage());
			}
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.getCloseConnection();
		}
	}
}