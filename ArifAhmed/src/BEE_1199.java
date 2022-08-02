import java.util.Scanner;

public class BEE_1199 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(;;) {
			String n = in.next();//2147483645
			int quotient = 0;
			int remainder;
			String res = "";
			int res2 = 0;
			if(n.length()>1) {
				char a = n.charAt(0);
				char b = n.charAt(1);
				int v = 2;
				if(a=='0' && b == 'x') {// hexa to decimal
					int len = n.length();
					for(int k = len-1; k>1;k--) {
						char f = n.charAt(v);
						res = res + f;
						v++;
					}
					int len2 = res.length()-1;
					String res3 = res.toUpperCase();
					for(int z = 0; z<res.length();z++) {
						char t = res3.charAt(z);
						String go = Character.toString(t);
						if(go.equals("A")) go = "10";
						else if(go.equals("B")) go = "11";
						else if(go.equals("C")) go = "12";
						else if(go.equals("D")) go = "13";
						else if(go.equals("E")) go = "14";
						else if(go.equals("F")) go = "15";
						int n1 = Integer.parseInt(go);
						n1 = n1*(int) Math.pow(16, len2);
						res2 = res2+n1;
						len2--;
					}
					System.out.println(res2);
				}
				else {//decimal to hexa
					int n1 = Integer.valueOf(n);//10
					if(n1<0) break;//-1 here '-' & '1' so len is 2 Answered
					if(n1<16 && n1>9) {
						n1 = hex(n1);
						char p = Character.valueOf((char) n1);
						res = res + p;
						System.out.print("0x"+res);
						System.out.println();
					}
					else {
						while(n1/16!=0) { //2147483645 / 16 = ans
							quotient = n1/16;
							remainder = n1%16;//13
							String r1 = String.valueOf(remainder);
							if(remainder<16 && remainder>9) {
								remainder = hex(remainder);
								char p = Character.valueOf((char) remainder);
								res = res + p;
							}
							else {
								res = res + r1;
							}
							n1 = quotient;
						}
						//This part is for swapping the variables from a to z To z to a
						String ne = "";
						int len = res.length();
						for(int j = len-1; j>=0; j--) {
							char f = res.charAt(j);
							ne = ne + f;
						}
						//
						String q1 = String.valueOf(quotient);
						if(q1.equals("10")) q1 = "A";
						else if(q1.equals("11")) q1 = "B";
						else if(q1.equals("12")) q1 = "C";
						else if(q1.equals("13")) q1 = "D";
						else if(q1.equals("14")) q1 = "E";
						else if(q1.equals("15")) q1 = "F";
						res = q1+ne;
						System.out.print("0x"+res);
						System.out.println();
						
					}
				}
			}
			
			else {
				System.out.println("0x"+n);
				
			}	
		}

	}
	public static int hex(int rem) {
		if(rem==10) rem = 'A'; 
		else if(rem == 11) rem ='B';
		else if(rem == 12) rem ='C';
		else if(rem == 13) rem ='D';
		else if(rem == 14) rem ='E';
		else if(rem == 15) rem ='F';
		return rem;
		
	}

}
