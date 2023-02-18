class Xog{
	Xog bark = null;
	int count;
	
	public Xog(int c) {
		count = c;
	}
	void manytimes(int c) {
		Xog bark2 = new Xog(c);
		Xog bark3 = this;
		while(bark3.bark!=null) {
			bark3 = bark3.bark;
		}
		bark3.bark = bark2;
	}
	public String toString() {
	    String result = count + " ";
	    if (bark != null) {
	        result += bark.toString();
	    }
	    return result;
	}
}
public class WTFISTHIS {

	public static void main(String[] args) {
		Xog m = new Xog(5);
		int[] arr = {1,2,3,4,9};
		for(int val:arr) {
			m.manytimes(val);
		}
		System.out.println(m.toString());

	}

}
