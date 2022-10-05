package pac;

import java.util.ArrayList;

public class Book {
	String title;
	ArrayList<String> paragraphs;
	ArrayList<String> images;
	ArrayList<String> tables;	
	
	public Book(String title) {
		this.title = title;
		this.paragraphs = new ArrayList<String>();
		this.images = new ArrayList<String>();
		this.tables = new ArrayList<String>();
	}

	public void createNewParagraphs(String paragraph) {
		this.paragraphs.add(paragraph);
	}

	public void createNewImages(String image) {
		this.images.add(image);
	}

	public void createNewTables(String table) {
		this.tables.add(table);
	}
	
	public void print() {
		System.out.println( "Title: " + this.title + "\n" + this.paragraphs + "\n" + this.images + "\n" + this.tables);
	}
}

