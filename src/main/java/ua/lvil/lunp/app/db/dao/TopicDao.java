package ua.lvil.lunp.app.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ua.lvil.lunp.app.db.Constants;
import ua.lvil.lunp.app.db.util.DBManager;
import ua.lvil.lunp.app.entities.Topic;

public class TopicDao {
	public List<Topic> findAllTopics() {
		List<Topic> list = new ArrayList<>();
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.getInstance().getConnection();
			st = con.createStatement();
			rs = st.executeQuery(Constants.FIND_ALL_TOPICS);
			while (rs.next()) {
				Topic t = new Topic();
				t.setId(rs.getInt(1));
				t.setSubjectId(rs.getInt(2));
				t.setName(rs.getString(3));
				list.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			DBManager.getInstance().rollbackAndClose(con);
		} finally {
			DBManager.getInstance().commitAndClose(con);
		}
		
		
		return list;
	}
	
	public Topic findTopicBySubjectId(int subjectId) {
		Topic topic = new Topic();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.getInstance().getConnection();
			ps = con.prepareStatement(Constants.FIND_TOPIC_BY_SUBJECT_ID);
			ps.setInt(1, subjectId);
			rs = ps.executeQuery();
			if (rs.next()) {
				topic.setId(rs.getInt(1));
				topic.setSubjectId(rs.getInt(2));
				topic.setName(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			DBManager.getInstance().rollbackAndClose(con);
		} finally {
			DBManager.getInstance().commitAndClose(con);
		}
		
		return topic;
	}
}
