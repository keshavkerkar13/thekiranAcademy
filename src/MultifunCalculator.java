public class MultifunCalculator {

	int price = 800;
	String cname = "casio";

	void addTwo(int a, int b) {
		int c = a + b;
		System.out.println("Start of the method");
		System.out.println("Addition =" + c);
	}

	void subTwo(int a, int b) {
		int c = b + a;
		System.out.println("Substraction =" + c);
	}

	void mulTwo(int a, int b) {
		int c = a * b;
		System.out.println("Multi=" + c);
	}

	void divTwo(int a, int b) {
		int c = a / b;
		System.out.println("Divison =" + c);
		System.out.println("End of the method");
	}
}
