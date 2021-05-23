package ua.lvil.lunp.app.db.util;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	
	private static DBManager instance;

	public static synchronized DBManager getInstance() {
		if (instance == null)
			instance = new DBManager();
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			Context context = new InitialContext();			
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/easy_learn");
			con = ds.getConnection();
		} catch (NamingException ex) {
			ex.printStackTrace();	
		}
		return con;
	}
	
	public Connection getConnectionWithDriverManager() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = DriverManager
				
				.getConnection("jdbc:mysql://localhost:3306/easy_learn?user=root&password=1234&serverTimezone=UTC&useUnicode=true&encoding=UTF-8");
		connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		connection.setAutoCommit(false);
		return connection;
	}

	private DBManager() {	}

	public void commitAndClose(Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.commit();
				con.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void rollbackAndClose(Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.rollback();
				con.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
}