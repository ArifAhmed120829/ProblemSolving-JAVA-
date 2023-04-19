
public class rec_name {
	public String name(String name) {
		int length = name.length();
		String rev_name = "";
		rev(name,length-1,rev_name);
		return  name;
	}
	private void rev(String name, int l, String rev_name) {
		if(l>=0) {
			rev_name = rev_name + name.charAt(l);
			l--;
			rev(name,l,rev_name);
		}
		else {
			System.out.println(rev_name);
		}
		
	}
	public static void main(String[] args) {
		String namee = "Abirt";
		rec_name ob = new rec_name();
		System.out.println(ob.name(namee));
	}

}
