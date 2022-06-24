
import java.util.Scanner;
public class Coding_04 {

	public static void main(String[] args) {
		//for(int i=40;i>=1;i--) {
		//	System.out.println(5*i);
			
		//}
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		int height=scan.nextInt();
		

		if(age>=10) {
			if(height>=46)
				System.out.println("enjoy indian jones adventure ride");
		}
		else
			System.out.println("Sorry your age is less than 10");

	}

}
