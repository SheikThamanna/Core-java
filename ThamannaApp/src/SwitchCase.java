/**
 * Print the Days
 * Sunday
 * Monday
 * Tuesday
 * Wednesday 
 * Thrusday
 * Friday
 * Saturday
 * 
 * @author Sheik Thamanna
 *
 */
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=3;
		/*if(day==1) {
			System.out.println("Monday");
		}
		else if(day==2) {
			System.out.println("Tuesday");
		}
		else if(day==3) {
			System.out.println("Wednesday");
		}
		else if(day==4) {
			System.out.println("Thrusday");
		}
		else if(day==5)
		{
			System.out.println("Friday");
		}
		else if(day==6)
		{
			System.out.println("Saturday");
		}
		else if(day==7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("invalid day");
*/		
		switch(day) {
		  case 1:
			System.out.println("MONDAY");
			break;
		  case 2:
			System.out.println("TUESDAY");
			//break;
		  case 3:
			System.out.println("WEDNESDAY");
			break;
		  case 4:
			System.out.println("THURSDAY");
			break;
		  case 5:
			System.out.println("FRIDAY");
			break;
		  case 6:
			System.out.println("SATURDAY");
			break;
		  case 7:
			System.out.println("SUNDAY");
			break;
		  default:
			System.out.println("not a valid day");
			break;
		
		

	}

	}
}
