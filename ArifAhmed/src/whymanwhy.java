import java.util.Scanner;

public class whymanwhy {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
				for(;;) {
					String[] str;
					str = new String[100];
					int t = in.nextInt();
					if(t==0) {
						break;
					}
					else {
						in.nextLine();
						int [] p = new int[100]; 
						int z = 0;
						int[] h = new int[100];
						int[] u1 = new int[100];
						int[] r1 = new int[100];
						int[] fin = new int[100];
						String res = "";
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
								String[] words = str[i].trim().split("\\s+");
								r = words.length;
								r1[i] = r;
								
							}
						}
						int max = u1[0];
						for(int i = 0; i<t; i++) {
							if(i>0) {
								if(max<=u1[i]) {
									max = u1[i];
								}
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
							
						}// third loop max_length
						for(int i = 0; i<t; i++) {
							if(max!=u1[i]) {
								u1[i] = u1[i]+(r1[i]-1);
								fin[i] = z-u1[i];
							}
						}// 4th loop first blank spaces
						
						for(int i = 0; i<t; i++) {
						    int f = 0;
							res="";
							String[] words = str[i].trim().split("\\s+");
							
								if(max==u1[i]) {
									for(String w:words) {
										res = res + w;
										f++;
										if(f!=r1[i]) {
											res = res+" ";
										}
									}
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
								}
							
							System.out.println(res);
							
						}//result
						System.out.println();
						
					}
			
					
				}
					
				

	}

}
