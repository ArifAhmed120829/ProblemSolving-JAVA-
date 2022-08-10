import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_2310 {
	static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number_of_players = in.nextInt();
		int[] s = new int[number_of_players];
		int[] b = new int[number_of_players];
		int[] a = new int[number_of_players];
		int[] s1 = new int[number_of_players];
		int[] b1 = new int[number_of_players];
		int[] a1 = new int[number_of_players];
		for(int i = 0; i<number_of_players; i++) {
			String name = in.next();//Renan
			int service = in.nextInt();//10
			int blocks = in.nextInt();//20
			int attacks = in.nextInt();//12
			int service1 = in.nextInt();//1
			int blocks1 = in.nextInt();//10
			int attacks1 = in.nextInt();//9
			s[i] =  service;
			b[i] = blocks; 
			a[i] = attacks;
			s1[i] =  service1;
			b1[i] = blocks1; 
			a1[i] = attacks1;
		}
		int j = 0;
		int  i = 1;
		while(i!=number_of_players) {
			s[j] = s[j] + s[i];
			b[j] = b[j] + b[i];
			a[j] = a[j] + a[i];
			s1[j] = s1[j] + s1[i];
			b1[j] = b1[j] + b1[i];
			a1[j] = a1[j] + a1[i];
			i++;
		}
		double n =  ((double) 100 / ((double) (s[j])/ (double) (s1[j])));
		double n2 =  ((double) 100 / ((double) (b[j])/ (double) (b1[j])));
		double n3 =  ((double) 100 / ((double) (a[j])/ (double) (a1[j])));
		System.out.println("Pontos de Saque: "+df.format(n)+" %.");
		System.out.println("Pontos de Bloqueio: "+df.format(n2)+" %.");
		System.out.println("Pontos de Ataque: "+df.format(n3)+" %.");

	}

}
