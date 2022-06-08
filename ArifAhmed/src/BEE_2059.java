import java.util.Scanner;

public class BEE_2059 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int p,j1,j2,r,a;
		p = in.nextInt();//1
		j1 = in.nextInt();//4
		j2 = in.nextInt();//5
		r = in.nextInt();//1
		a = in.nextInt();//1
		int sum = j1+j2;
		if(p==1) {
			if(sum%2==0) {
				if(r==0 & a==0) {
					System.out.println("Jogador 1 ganha!");
				}
				else if(r==1 & a==0) {
					System.out.println("Jogador 1 ganha!");
				}
				else if(r==1 & a==1) {
					System.out.println("Jogador 2 ganha!");
				}
				else if(r==0 & a==1) {
					System.out.println("Jogador 1 ganha!");
				}
			}
			else if(sum%2==1) {
				if(r==1 & a==0) {
					System.out.println("Jogador 1 ganha!");
				}
				else if(r==1 & a==1) {
					System.out.println("Jogador 2 ganha!");
				}
				else if(r==0 & a==0) {
					System.out.println("Jogador 2 ganha!");
				}
				else if(r==0 & a==1) {
					System.out.println("Jogador 1 ganha!");
				}
			}
		}
		else if(p==0) {
			if(sum%2==1) {
				if(r==0 & a==0) {
					System.out.println("Jogador 1 ganha!");
				}
				else if(r==1 & a==0) {
					System.out.println("Jogador 1 ganha!");
				}
				else if(r==1 & a==1) {
					System.out.println("Jogador 2 ganha!");
				}
				else if(r==0 & a==1) {
					System.out.println("Jogador 1 ganha!");
				}
			}
			else if(sum%2==0) {
				if(r==1 & a==0) {
					System.out.println("Jogador 1 ganha!");
				}
				else if(r==1 & a==1) {
					System.out.println("Jogador 2 ganha!");
				}
				else if(r==0 & a==0) {
					System.out.println("Jogador 2 ganha!");
				}
				else if(r==0 & a==1) {
					System.out.println("Jogador 1 ganha!");
				}
			}
			
		}

	}

}
