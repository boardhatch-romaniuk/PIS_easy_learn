package ua.lvil.lunp.app.db;

public class Constants {
	public static final String FIND_ALL_SUBJECTS = "select * from subjects;";
	public static final String FIND_ALL_TOPICS = "select * from topics;";
	public static final String FIND_CONTENT_BY_TOPIC_ID = "select id, text, topic_id from contents where contents.topic_id = ?;";
	public static final String FIND_TOPICS_BY_SUBJECT_ID = "select * from topics where topics.subject_id = ?;";
	public static final String FIND_TEST_BY_CONTENT_ID = "select * from tests where tests.content_id = ?;";
	public static final String SET_TEST_IS_PASSED_BY_TEST_ID = "update tests set tests.isPassed = ? where tests.id = ?;";
	public static final String FIND_SUBJECT_NAME_BY_ID = "select name from subjects where id = ?;";
	public static final String FIND_TOPIC_BY_ID = "select * from topics where id = ?;";
}
