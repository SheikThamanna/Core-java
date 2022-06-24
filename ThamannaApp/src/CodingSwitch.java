
import java.util.Scanner;
public class CodingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		 
		
		switch(n%2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
			
			
			
		}
		

	}

}
