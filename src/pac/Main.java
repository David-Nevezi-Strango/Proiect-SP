package pac;

public class Main {

	public static void main(String[] args) {
		Book discoTitanic = new Book("Disco Titanic");
		discoTitanic.createNewParagraphs("Paragraph 1");
		discoTitanic.createNewParagraphs("Paragraph 2");
		discoTitanic.createNewParagraphs("Paragraph 3");
		discoTitanic.createNewImages("Image 1");
		discoTitanic.createNewParagraphs("Paragraph 4");
		discoTitanic.createNewTables("Table 1");
		discoTitanic.createNewParagraphs("Paragraph 5");
		
		discoTitanic.print();

	}

}
