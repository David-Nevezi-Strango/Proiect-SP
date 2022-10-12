package pkg;

import java.util.ArrayList;

public class SubChapter {
	String name;
	ArrayList<Paragraph> paragraphs;
	ArrayList<Image> images;
	ArrayList<Table> tables;

	public SubChapter(String name) {
		this.name = name;
		paragraphs = new ArrayList<Paragraph>();
		images = new ArrayList<Image>();
		tables = new ArrayList<Table>();
	}
	
	public void print() {
		System.out.println("SubChapter: " + this.name);
		paragraphs.forEach(Paragraph::print);
		images.forEach(Image::print);
		tables.forEach(Table::print);
	}

	public void createNewParagraphs(String titleParagraph) {
		Paragraph paragraph = new Paragraph(titleParagraph);
		this.paragraphs.add(paragraph);
		//return chapters.indexOf(chapter);
	}

	public void createNewImages(String titleImage) {
		Image image = new Image(titleImage);
		this.images.add(image);
		
	}

	public void createNewTables(String titleTable) {
		Table table = new Table(titleTable);
		this.tables.add(table);
		
	}
}
