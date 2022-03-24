import java.util.Scanner;

public class b_1828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 1; i<=T; i++) {
			String Sheldon = in.next();
			String Raj = in.next();
			if(Sheldon.equals("tesoura")  && Raj.equals("papel")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Raj.equals("tesoura")  && Sheldon.equals("papel")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals("papel") && Raj.equals("pedra")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Sheldon.equals("pedra") && Raj.equals("papel")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals("pedra")  && Raj.equals("lagarto")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Raj.equals("pedra")  && Sheldon.equals("lagarto")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals("lagarto") && Raj.equals("Spock")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Sheldon.equals("Spock") && Raj.equals("lagarto")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals("Spock")  && Raj.equals("tesoura")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Raj.equals("Spock")  && Sheldon.equals("tesoura")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals("tesoura") && Raj.equals("lagarto")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Sheldon.equals("lagarto") && Raj.equals("tesoura")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals("lagarto")  && Raj.equals("papel")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Raj.equals("lagarto")  && Sheldon.equals("papel")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals("papel") && Raj.equals("Spock")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Sheldon.equals("Spock") && Raj.equals("papel")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals("Spock")  && Raj.equals("pedra")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Raj.equals("Spock")  && Sheldon.equals("pedra")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals("pedra") && Raj.equals("tesoura")) System.out.println("Caso #"+i+": Bazinga!");
			else if(Sheldon.equals("tesoura") && Raj.equals("pedra")) System.out.println("Caso #"+i+": Raj trapaceou!");
			else if(Sheldon.equals(Raj) || Raj.equals(Sheldon)) System.out.println("Caso #"+i+": De novo!");
			
			
		}
		
		

	}

}
