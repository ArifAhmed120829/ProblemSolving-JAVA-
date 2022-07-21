import java.util.Scanner;

public class BEE_1247 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while(in.hasNext()) {
			float distance = in.nextFloat();
			float thief_speed = in.nextFloat();
			float guard_speed = in.nextFloat();
			float final_destination = 12;
			float final_des_guard = (float) Math.sqrt(144+(distance*distance));
			float final_time_thief = final_destination/thief_speed;
			float final_time_guard = final_des_guard/guard_speed;
			if(final_time_guard<=final_time_thief) {
				System.out.println("S");
			}
			else {
				System.out.println("N");
			}
		}
		
	}

}
