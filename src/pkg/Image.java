package pkg;

public class Image {
	String imageName;

	public Image(String imageName) {
		this.imageName = imageName;
	}
	
	public void print() {
		System.out.println("Image with name: " + this.imageName);
	}
}