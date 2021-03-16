package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class ProgramJDBC {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// https://github.com/acenelio/demo-dao-jdbc/blob/master/database.sql
		// https://github.com/acenelio/jdbc1 - conexão
		// https://github.com/acenelio/jdbc2 - select
		// https://github.com/acenelio/jdbc3 - insert
		// https://github.com/acenelio/jdbc4 - update
		// https://github.com/acenelio/jdbc5 - delete

		// Connection conn = DB.getConnection();
		// System.out.println("Banco de Dados Conectado: " + conn);
		// DB.getCloseConnection();

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement pe = null;

		// Consulta BD: Connection; Statement; ResultSet
		try {
			if (DB.getConnection() != null) {
				conn = DB.getConnection();
				st = conn.createStatement();
				rs = st.executeQuery("select * from department");

				if (rs.isBeforeFirst() == false) {
					System.out.println("Register not found!!!");
				}

				while (rs.next()) {
					System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
				}
			}

			System.out.println();

			// Insert BD - Connection; PreparedStatement, ResultSet - seller (Vendedor)
			pe = conn.prepareStatement("insert into seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ " values " + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS); // placeholder

			pe.setString(1, "Julia Brito");
			pe.setString(2, "juju@gmail.com");
			pe.setDate(3, new java.sql.Date(sdf.parse("21/03/1980").getTime()));
			pe.setDouble(4, 4000.0);
			pe.setInt(5, 4);
			
			// EXAMPLE 2:
			//st = conn.prepareStatement(
			//		"insert into department (Name) values ('D1'),('D2')", 
			//		Statement.RETURN_GENERATED_KEYS);			

			int rowsAffected = pe.executeUpdate();

			rs.close();
			if (rowsAffected > 0) {
				rs = pe.getGeneratedKeys();

				while (rs.next()) {
					int id = rs.getInt(1); // Tabela Auxiliar que terá somente o ID
					System.out.println("Register Insered! id: " + id);
				}
			} else {
				System.out.println("Not rows affected!!!");
			}
			
			// Update BD - Connection; PreparedStatement, ResultSet - seller (Vendedor)
			pe.close();
			pe = conn.prepareStatement("update seller set " + "Email = ? "
					+ " where Id = ?", Statement.RETURN_GENERATED_KEYS); // placeholder
			
			pe.setString(1, "juliadebrito@gmail.com");
			pe.setInt(2, 10);
			
			int rowsAffected2 = pe.executeUpdate();
			
			if ( rowsAffected2 > 0) {
				System.out.println("Done!!! Rows affected: " + rowsAffected2);
				System.out.println("Register updated! id: " + 10);
			}
			
			// Delete BD - Connection; PreparedStatement, ResultSet - seller (Vendedor)
			pe.close();
			pe = conn.prepareStatement("delete from seller where Id = ?", 
					                    Statement.RETURN_GENERATED_KEYS); // placeholder
			
			pe.setInt(1, 8);
			
			int rowsAffected3 = pe.executeUpdate();
			
			if ( rowsAffected3 > 0) {
				System.out.println("Register excluded! id: " + 8);
			}
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
			// System.out.println(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeStatement(pe);
			DB.getCloseConnection();
		}
	}
}
