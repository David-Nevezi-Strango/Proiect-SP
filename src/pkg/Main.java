package pkg;

public class Main {

	public static void main(String[] args) {
		Book discoTitanic = new Book("Disco Titanic");
		Author rpGheo = new Author("Radu Pavel Gheo");
		
		discoTitanic.addAuthor(rpGheo);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		
		scOneOne.createNewParagraphs("Paragraph 1");
		scOneOne.createNewParagraphs("Paragraph 2");
		scOneOne.createNewParagraphs("Paragraph 3");
		scOneOne.createNewImages("Image 1");
		scOneOne.createNewParagraphs("Paragraph 4");
		scOneOne.createNewTables("Table 1");
		scOneOne.createNewParagraphs("Paragraph 5");
		
		scOneOne.print();

	}

}
