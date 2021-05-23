package ua.lvil.lunp.app.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ua.lvil.lunp.app.db.Constants;
import ua.lvil.lunp.app.db.util.DBManager;
import ua.lvil.lunp.app.entities.Test;

public class TestDao {
	public Test findTestByContentId(int contentId) {
		Test test = new Test();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.getInstance().getConnection();
			ps = con.prepareStatement(Constants.FIND_TEST_BY_CONTENT_ID);
			ps.setInt(1, contentId);
			rs = ps.executeQuery();
			if (rs.next()) {
				test.setId(rs.getInt(1));
				test.setPassed(rs.getBoolean(2));
				test.setContentId(rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			DBManager.getInstance().rollbackAndClose(con);
		} finally {
			DBManager.getInstance().commitAndClose(con);
		}
		
		return test;
	}
	
	public void setTestIsPassedByTestId(boolean isPassed, int testId) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBManager.getInstance().getConnection();
			ps = con.prepareStatement(Constants.SET_TEST_IS_PASSED_BY_TEST_ID);
			ps.setBoolean(1, isPassed);
			ps.setInt(2, testId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			DBManager.getInstance().rollbackAndClose(con);
		} finally {
			DBManager.getInstance().commitAndClose(con);
		}
	}
}
