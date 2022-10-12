package pkg;

import java.util.ArrayList;

public class Book {
	String title;
	Author author;
	ArrayList<Chapter> chapters;
	TableOfContents tableOfContents;
	
	public Book(String title) {
		this.title = title;
		this.chapters = new ArrayList<Chapter>();
	}

	public void print() {
		System.out.println("Book: " + this.title);
		this.chapters.forEach(Chapter::print);
	}

	public void setTableOfContents(TableOfContents tableOfContents) {
		this.tableOfContents = tableOfContents;
	}

	public int createChapter(String chapterTitle) {
		Chapter chapter = new Chapter(chapterTitle);
		this.chapters.add(chapter);
		return chapters.indexOf(chapter);
	}
	

	public Chapter getChapter(int indexChapter) {
		return chapters.get(indexChapter);
	}
	
	public void addTableOfContents(TableOfContents tableOfContents) {
		this.tableOfContents = tableOfContents;
	}

	public void addAuthor(Author author) {
		this.author = author;
		
	}

}

