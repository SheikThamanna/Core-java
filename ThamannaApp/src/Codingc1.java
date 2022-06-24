 import java.util.Scanner;
public class Codingc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		//score is less than 60 the print is fail 
		if(score<60) {
			System.out.println("Fail");
		}
		//score is greater than are equal to 60 print pass
		else if(score >=60 && score<90) {
			System.out.println("Pass");
		}
		//score is more than 60 print distinction
		else 
		{
			System.out.println("distinction");
		}
		

	}

}
