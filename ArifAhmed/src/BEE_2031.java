import java.util.Scanner;

public class BEE_2031 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt();
		for(int i = 0; i<N; i++) {
			String first = in.next();
			String sec = in.next();
			if(first.equals("ataque")& sec.equals("pedra")) {
				System.out.println("Jogador 1 venceu");
			}
			else if(sec.equals("ataque")& first.equals("pedra")) {
				System.out.println("Jogador 2 venceu");
			}
			else if(first.equals("pedra")& sec.equals("papel")) {
				System.out.println("Jogador 1 venceu");
			}
			else if(sec.equals("pedra")& first.equals("papel")) {
				System.out.println("Jogador 2 venceu");
			}
			else if(first.equals("ataque")&sec.equals("papel")) {
				System.out.println("Jogador 1 venceu");
			}
			else if(sec.equals("ataque")&first.equals("papel")) {
				System.out.println("Jogador 2 venceu");
			}
			else if(first.equals("papel")& sec.equals("papel")) {
				System.out.println("Ambos venceram");
			}
			else if(first.equals("pedra")& sec.equals("pedra")) {
				System.out.println("Sem ganhador");
			}
			else if(first.equals("ataque")& sec.equals("ataque")) {
				System.out.println("Aniquilacao mutua");
			}
		}

	}

}
