package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Book extends Media {

private List<String> authors = new ArrayList<String>();
private String content;
public List<String>contentTokens =  new ArrayList<String>();
public Map<String, Integer>wordFrequency = new TreeMap<String, Integer>();

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
	processContent();
}
private void processContent() {
	// split by \\s and convert Array<String> to List<String>
	// add all to contentTokens
	contentTokens.addAll(Arrays.asList(content.split("\\s+")));
	// contentToken has been sorted
	Collections.sort(contentTokens);
	// loop in List contentToken
	Iterator<String> iterator = contentTokens.iterator();
	while(iterator.hasNext()) {
		String string = iterator.next();
		// if don't have key --> put to Map
		// else value++ --> put to Map
		if (wordFrequency.containsKey(string) == false) {
			wordFrequency.put(string, 1);
		}else {
			int a = wordFrequency.get(string);
			a++;
			wordFrequency.put(string, a);
		}
	}
}

public void setAuthors(List<String> authors) {
	this.authors = authors;
}
public void setAuthors(ArrayList<String> authors) {
	this.authors = authors;
}

public List<String> getAuthors() {
	return authors;
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





