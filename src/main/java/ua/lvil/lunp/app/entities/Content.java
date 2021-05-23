package ua.lvil.lunp.app.entities;

public class Content {
	private int id;
	private String text;
	private int topicId;
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Content [id=" + id + ", text=" + text + ", topicId=" + topicId + "]";
	}
	
	
}
