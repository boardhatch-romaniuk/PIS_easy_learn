package ua.lvil.lunp.app.entities;

public class Topic {
	private int id;
	private int subjectId;
	private String name;
	
	public Topic() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", subjectId=" + subjectId + ", name=" + name + "]";
	}
	
	
}
