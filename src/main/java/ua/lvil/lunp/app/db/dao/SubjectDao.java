package ua.lvil.lunp.app.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ua.lvil.lunp.app.db.Constants;
import ua.lvil.lunp.app.db.util.DBManager;
import ua.lvil.lunp.app.entities.Subject;

public class SubjectDao {
	
	public List<Subject> findAllSubjects() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Subject> list = new ArrayList<>();
		
		try {
			con = DBManager.getInstance().getConnection();
			st = con.createStatement();
			rs = st.executeQuery(Constants.FIND_ALL_SUBJECTS);
			while (rs.next()) {
				Subject sb = new Subject();
				sb.setId(rs.getInt(1));
				sb.setName(rs.getString(2));
				sb.setDescription(rs.getString(3));
				sb.setImg(rs.getString(4));
				sb.setWidth(rs.getInt(5));
				sb.setHeight(rs.getInt(6));
				list.add(sb);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			DBManager.getInstance().rollbackAndClose(con);
		} finally {
			DBManager.getInstance().commitAndClose(con);
		}
		
		return list;
	}
}
