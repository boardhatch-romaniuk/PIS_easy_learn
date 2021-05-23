package ua.lvil.lunp.app.bean;

public class Bean {
	private int id;
	private String str;
	
	public Bean() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Bean [id=" + id + ", str=" + str + "]";
	}
	
	
	
	
}
