import java.util.Scanner;

public class BEE_1278 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		for(;;) {
			String[] str;
			str = new String[100];
			int t = in.nextInt();
			in.nextLine();
			int [] p = new int[100]; 
			int z = 0;
			int d = 0;
			int[] d1 = new int[100];
			int[] h = new int[100];
			int[] u1 = new int[100];
			int[] r1 = new int[100];
			int[] fin = new int[100];
			//String[] sum = new String[50];
			String res = "";
			if(t==0) break;
			for(int i = 0; i<t; i++) {
				int k = 0;
				int u = 0;
				int r = 0;
				str[i] = in.nextLine();
				p[i] = str[i].length();
				for(int j = 0; j<p[i]; j++) {
					if(str[i].charAt(j) == ' ') {
						k++;
						h[i] = k;
					}
					if(Character.isLetter(str[i].charAt(j))) {
						u++;
						u1[i] = u;
					}
					if(Character.isDigit(str[i].charAt(j))) {
						d++;
						d1[i] = d;
					}
					String[] words = str[i].trim().split("\\s+");
					r = words.length;
					r1[i] = r;
					
				}
			}
			//End of First loop
			int max = u1[0];
			for(int i = 0; i<t; i++) {
				if(i>0) {
					if(max<=u1[i]) {
						max = u1[i];
					}
					// new
					else if(max<=d1[i]) {
						max = d1[i];
					}
					//new
				}
			}// second loop max
			for(int i = 0; i<t; i++) {
				String[] words = str[i].trim().split("\\s+");
				if(max==u1[i]) {
					for(String w:words){
						res = res + w;
						}
					z = res.length()+(r1[i]-1);
				}
				//new
				else if(max==d1[i]) {
					for(String w:words){
						res = res + w;
						}
					z = res.length()+(r1[i]-1);
				}
				//new
				
			}// third loop max_length
			for(int i = 0; i<t; i++) {
				if(max!=u1[i]) {
					u1[i] = u1[i]+(r1[i]-1)+d1[i];
					fin[i] = z-u1[i];
				}
				
			}// 4th loop first blank spaces
			
			for(int i = 0; i<t; i++) {
			    int f = 0;
				res="";
				//System.out.println(d1[i]);
				//System.out.println(str[i]);//full_word
				//System.out.println(p[i]);//length
				//System.out.println(h[i]);//blank_space
				//System.out.println(u1[i]);//letter
				//System.out.println(r1[i]);//word
				//System.out.println(max);//max_letter
				//System.out.println(z);
				String[] words = str[i].trim().split("\\s+");
				
					if(max==u1[i]) {
						for(String w:words) {
							res = res + w;
							f++;
							if(f!=r1[i]) {
								res = res+" ";
							}
						}
						
						/*
						for(int v = 1; v<r1[i]; v++ ) {
							res = res + " ";
						}
						*/
					}
					else {
						for(int c = 0; c<fin[i]; c++) {
							System.out.print(" ");
						}
						for(String w:words) {
							res = res + w;
							f++;
							if(f!=r1[i]) {
								res = res+" ";
							}
						}
						
						/*
						for(int v = 1; v<r1[i]; v++ ) {
							res = res + " ";
						}
						*/
					}
				System.out.print(res);
				System.out.println();
			}//result
			System.out.println();
		}
		

	}

}
