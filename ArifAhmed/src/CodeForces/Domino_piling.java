package codeforce;
import java.util.*;

public class Domino_piling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int w = in.nextInt();
		
		//rectangle area = length *width;
		
		int area = l*w;
		int domino_area = 2*(1);
		System.out.println(area/domino_area);

	}

}
