package Java_classes;

public class gklf {

	public static void main(String[] args) {
		/*
		char a='1';
		char n ='2';
		String plus;
		plus = a+""+n;
		int int_plus = Integer.parseInt(plus);
		int sum = int_plus + 100;
		System.out.println(sum);
		*/
		String next_part = "12300=99900";
		String first_half = "";
		String second_half = "";
		int len = next_part.length();
		//char[] arr = new char[len];
		char wtf;
		char wtf2;
		int j = 0;
		System.out.println(len);
		for(int i = 0; i<len; i++) {
			wtf = next_part.charAt(i);
			if(wtf=='=') {
				i = len;
				j++;
				continue;
			}
			j++;
			
			first_half = first_half + wtf;
			
		}
		int yuh_baby = Integer.parseInt(first_half);
		for(int k = j; k<len; k++) {
			wtf2 = next_part.charAt(k);
			second_half = second_half + wtf2;
		}
		int yuh_baby2 = Integer.parseInt(second_half);
		System.out.println(yuh_baby);
		System.out.println(yuh_baby2);

	}

}
