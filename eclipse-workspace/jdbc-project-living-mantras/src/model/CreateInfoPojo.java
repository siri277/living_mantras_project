package model;

public class CreateInfoPojo {
	private String description;
	private String category;

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CreateInfoPojo(String category , String description) {
		super();
		this.description = description;
		this.category = category;
	}
}
