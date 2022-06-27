import java.util.Scanner;
public class Str1 {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the char value:");
     String s=scan.nextLine();
     scan.close();
     char value=s.charAt(1);
     System.out.println("char value provided by user:" + value);
     
	}

}
