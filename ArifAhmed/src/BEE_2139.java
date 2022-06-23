import java.util.Scanner;

public class BEE_2139 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while(in.hasNext()) {
			int res = 0;
			int month = in.nextInt();
			int date = in.nextInt();
			switch(month) {
			case 1: res = 360-date;
				break;
			case 2: res = 360-31-date;
			break;
			case 3: res = 360 - 60 - date;
			break;
			case 4: res = 360-91-date;
			break;
			case 5: res = 360-121-date;
			break;
		    case 6: res = 360-152-date;
		    break;
		case 7: res = 360 - 182 - date;
		break;
		case 8: res = 360-213-date;
		break;
		case 9: res = 360-244-date;
		break;
	case 10: res = 360-274-date;
	break;
	case 11: res = 360 - 305 - date;
	break;
	case 12: res = 360-335-date;
	break;
			}
			if(res==1) {
				System.out.println("E vespera de natal!");
			}
			else if(res==0) {
				System.out.println("E natal!");
			}
			else if(res<0) {
				System.out.println("Ja passou!");
			}
			else {
				System.out.println("Faltam "+res+" dias para o natal!");
			}
			
		}
		

	}

}
