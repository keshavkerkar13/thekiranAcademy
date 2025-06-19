
public class TestFridge {

	public static void main(String[]args) {
		System.out.println("Start of the main method");
		DetailFridge f1 = new DetailFridge();
		f1.addItems(2, 2);
		f1.subItems(15, 8);
		System.out.println("End of the main method");
	}
}
