
public class MyLaptop {

	int price = 55000;
	String lname = "Dell";

	void AddRam(int r1, int r2) {
		System.out.println("Start of the method");
		int r3 = r1 + r2;
		System.out.println("Total Ram=" + r3);
	}

	void SubRam(int r1, int r2, int r3) {
		int r4 = r3 - r1 + r2;
		System.out.println("Remaining Storage=" + r4);
	}

	void MulRam(int r3, int r4) {
		int r5 = r3 * r4;
		System.out.println("Processor=" + r5);
	}

	void DivRam(int r5, int r4) {
		int r6 = r5 / r4;
		System.out.println("Total tasks=" + r6);
		System.out.println("End of the method");
	}
}
