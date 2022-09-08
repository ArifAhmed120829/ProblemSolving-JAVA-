package Java_classes;

public class TestThread {
	public static void main(String[] args) {
		SampleDemo A = new SampleDemo("A");
		SampleDemo B = new SampleDemo("B");
		
		B.start();
		A.start();
	}

}
