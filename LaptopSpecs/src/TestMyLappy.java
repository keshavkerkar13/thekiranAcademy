
public class TestMyLappy {

	public static void main(String[] args) {
		System.out.println("Start of the main method");
		MyLaptop l1 = new MyLaptop();
		l1.AddRam(4, 4);
		l1.SubRam(4, 4, 128);
		l1.MulRam(50, 70);
		l1.DivRam(128, 4);
		System.out.println("End of the main method");
	}

}
