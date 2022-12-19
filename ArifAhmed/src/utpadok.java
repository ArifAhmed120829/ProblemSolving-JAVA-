//V.V.Important
public class utpadok {

	public static void main(String[] args) {
		int fact  = 100;
		int five = 0;
		int two = 0;
		int res;
		while(fact!=1) {
			
				if(fact%5==0) {
					res = fact/5;
					five++;
					while(res%5==0) {
						res = res / 5;
						five++;
					}
					if(res%2==0) {
						while(res%2==0) {
							res = res / 2;
							two++;
						}
					}
				}
				else if(fact%2==0) {
					res = fact/2;
					two++;
					while(res%2==0) {
						res = res / 2;
						two++;
					}
				}
			fact--;
		}
		//System.out.println(five);//24
		//System.out.println(two);//97
		if(five<=two) System.out.println(five);
		else if(two<=five) System.out.println(two);
		

	}

}
