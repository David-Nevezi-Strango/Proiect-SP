package pkg;

public class Paragraph {
	String text;

	public Paragraph(String text) {
		this.text = text;
	}
	
	public void print() {
		System.out.println("Paragraph: " + this.text);
	}
}