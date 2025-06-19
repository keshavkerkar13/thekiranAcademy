
public class DetailFridge {

	String brand = "Haier";
	String colour = "Red";

	void addItems(int mp1, int mp2) {
		int mp = mp1 + mp2;
		System.out.println("Start of the method");
		System.out.println("Number of milk pouchs =" + mp);
	}

	void subItems(int t1, int t2) {
		int t3 = t1 - t2;
		System.out.println("Number of spoiled tomatos =" + t3);
		System.out.println("End of the method");
	}

}
