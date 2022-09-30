class SampleDemo implements Runnable{
	private Thread t;
	private String threadname;
	SampleDemo(String threadName){
		this.threadname = threadName;
	}
	public void run() {
		while(true) {
			System.out.println(threadname);
		}
	}
	public void start() {
		if(t== null) {
			t = new Thread(this, threadname);
			t.start();
		}
	}
}
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleDemo a = new SampleDemo("A");
		SampleDemo b = new SampleDemo("B");
		b.start();
		a.start();
	

	}

}
