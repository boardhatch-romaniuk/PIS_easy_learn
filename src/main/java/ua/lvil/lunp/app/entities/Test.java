package ua.lvil.lunp.app.entities;

public class Test {
	private int id;
	private boolean isPassed;
	private int contentId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isPassed() {
		return isPassed;
	}
	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", isPassed=" + isPassed + ", contentId=" + contentId + "]";
	}
	
	
}
