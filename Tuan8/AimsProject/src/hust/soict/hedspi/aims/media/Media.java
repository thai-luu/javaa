package hust.soict.hedspi.aims.media;

public abstract class Media {
protected String title;
protected String category;
protected float cost;
protected String id;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
public Media(String title) {
	this.title = title;
}
public Media(String id, String title) {
	this.id = id;
	this.title = title;
}
public Media(String id, String title, float cost) {
	this(id,title);
	this.cost = cost;
}
public Media(String id , String title, String category) {
	this(id,title);
	this.category = category;
}
public Media(String id , String title, String category, float cost) {
	this(id,title,category);
	this.cost = cost;
}
public int compareTo(Media media) {
	if (this instanceof Book && (media instanceof DigitalVideoDisc || media instanceof CompactDisc)) {
		return -1;
	}
	if(this instanceof DigitalVideoDisc && media instanceof CompactDisc)
		return -1;
	if(this instanceof CompactDisc && (media instanceof DigitalVideoDisc || media instanceof Book))
		return 1;
	if(this instanceof DigitalVideoDisc && media instanceof Book)
		return 1;
	return 0;
}
}
