import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class BEE_2311 {
	static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Double,Double> divers = new HashMap<Double,Double>();
		int number_of_divers = in.nextInt();
		for(int i = 0; i<number_of_divers; i++) {
			String name = in.next();
			double difficulty = in.nextDouble();
			double score1 = in.nextDouble();
			double score2 = in.nextDouble();
			double score3 = in.nextDouble();
			double score4 = in.nextDouble();
			double score5 = in.nextDouble();
			double score6 = in.nextDouble();
			double score7 = in.nextDouble();
			divers.put(1.0, score1);//key,value
			divers.put(2.0, score2);
			divers.put(3.0, score3);
			divers.put(4.0, score4);
			divers.put(5.0, score5);
			divers.put(6.0, score6);
			divers.put(7.0, score7);
			double x,y;// two key
			x = 1.0;
			y = 1.0;
			double max = 0.0;
			double min = divers.get(1.0);
			for(double j = 1.0; j<=7.0; j++) {
				if(j+1.0!=8.0) {
	if(max<divers.get(j)) {
					
						
						if(divers.get(j)==divers.get(j+1.0)) {
							max = divers.get(j);
							x = j;
						}
						else {
							max = Math.max(divers.get(j), divers.get(j+1.0));
							
							if(max==divers.get(j)) {
								x =j;
							}
							else {
								x= j+1.0;
							}
							
						}
						
					
				}
				
					
						if(min>divers.get(j+1.0)) {
							if(divers.get(j)==divers.get(j+1.0)) {
								min = divers.get(j);
								y = j;
							}
							else {
								min = Math.min(divers.get(j), divers.get(j+1.0));
								
								
								if(min==divers.get(j)) {
									y =j;
								}
								else {
									y = j+1.0;
								}
								
							}
							
							
						}
						
						
				}
				if(max<divers.get(7.0)) {
					max = divers.get(7.0);
					x=7.0;
				}
				if(min>divers.get(7.0)) {
					min = divers.get(7.0);
					y=7.0;
				}
				
	
			}
			
			
			if(x==y) {
				if(y+1.0!=8.0) {
					y = y+1.0;
				}
				else if(y-1.0!=0.0) {
					y = y-1.0;
				}
				else if(x+1.0!=8.0) {
					x = x+1.0;
				}else if(x-1.0!=0.0) {
					x = x-1.0;
				}
				divers.remove(x);
				divers.remove(y);
				
			}
			
			else {
				if(divers.containsValue(max)) {
					divers.remove(x);
				}
				if(divers.containsValue(min)) {
					divers.remove(y);
				}
			}
			double sum = 0.0;
			for(double m:divers.values()) {
				sum = sum + m;
			}
			double result = sum*difficulty;
			System.out.println(name+" "+df.format(result));
		}
		/*
		 * 1
Adelaide
2.2
5.0 5.0 5.1 5.2 5.3 5.4 5.5
		 */

	}

}
