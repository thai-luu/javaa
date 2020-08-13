
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private float cost;
	private int length;
	
	
	//contructor
	public DigitalVideoDisc(){
		
	}
	
	public DigitalVideoDisc(String title,String category,String director,float cost,int length)
	{
		this.title=title;
		this.category=category;
		this.director=director;
		this.cost=cost;
		this.length=length;
	}
	
	//geter and setter methods
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
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
}
