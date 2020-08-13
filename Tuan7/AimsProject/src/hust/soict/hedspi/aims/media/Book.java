package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Book extends Media {

private List<String> authors = new ArrayList<String>();
public void setAuthors(List<String> authors) {
	this.authors = authors;
}
public void setAuthors(ArrayList<String> authors) {
	this.authors = authors;
}

public List<String> getAuthors() {
	return authors;
}

public Book() {
	// TODO Auto-generated contructor stub
}
public Book(String id, String title, float cost) {
	super(id, title);
   this.cost = cost;
}

public Book(String id , String title, String category) {
	super(id,title,category);
}
public Book(String id, String title,String category,float cost) {
	super(id,title,category,cost);
}
public Book(String id , String title,String category, List<String> authors, float cost) {
	super(id,title,category,cost);
	this.authors = authors;
}
public void addAuthor(String authorName) {
	
	if (authors.contains(authorName)) {
		System.out.println("Errors book had author");
	}else authors.add(authorName);
	}
	

public void removeAuthor(String authorName) {
	
	if(authors.contains(authorName) ) {
		this.authors.remove(authorName);
	
	}
	else
		System.out.println("Errors book hadn't author");
	}
	
}





