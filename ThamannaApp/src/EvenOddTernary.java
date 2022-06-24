import java.util.Scanner;
public class EvenOddTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	//	String s=(n%2==0)? "Even":"Odd";
	//	System.out.println(s);
		if(n<=100 && n>=0) {
		String s=(n>60)?(n>90)?"passed with distinction":"pass":"fail";
        System.out.println(s);
		}
        else
		{
			System.out.println("invalid");
		}
		}
		
        
	}


