package hust.soict.hedspi.test.book;

import hust.soict.hedspi.aims.media.Book;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("20176867", "java", 100);
		b1.setContent("hello java");
		System.out.println(b1.getContent());
		System.out.println(b1.contentTokens);
		System.out.println(b1.wordFrequency);
		System.out.println("========================================");
		System.out.println(b1.toString());
	}
}
