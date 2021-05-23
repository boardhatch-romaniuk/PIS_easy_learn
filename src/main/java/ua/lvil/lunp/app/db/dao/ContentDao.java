package ua.lvil.lunp.app.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ua.lvil.lunp.app.db.Constants;
import ua.lvil.lunp.app.db.util.DBManager;
import ua.lvil.lunp.app.entities.Content;

public class ContentDao {
	
	public Content findContentByTopicId(int topicId) {
		Content content = new Content();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.getInstance().getConnection();
			ps = con.prepareStatement(Constants.FIND_CONTENT_BY_TOPIC_ID);
			ps.setInt(1, topicId);
			rs = ps.executeQuery();
			if (rs.next()) {
				content.setId(rs.getInt(1));
				content.setText(rs.getString(2));
				content.setTopicId(rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			DBManager.getInstance().rollbackAndClose(con);
		} finally {
			DBManager.getInstance().commitAndClose(con);
		}
		
		return content;
	}
}
