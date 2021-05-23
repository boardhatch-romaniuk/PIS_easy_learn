package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ua.lvil.lunp.app.db.Constants;
import ua.lvil.lunp.app.db.util.DBManager;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBManager.getInstance().getConnectionWithDriverManager();
			ps = con.prepareStatement(Constants.SET_TEST_IS_PASSED_BY_TEST_ID);
			ps.setBoolean(1, false);
			ps.setInt(2, 1);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			DBManager.getInstance().rollbackAndClose(con);
		} finally {
			DBManager.getInstance().commitAndClose(con);
		}
	}
}
