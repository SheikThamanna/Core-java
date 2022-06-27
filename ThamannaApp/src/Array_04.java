
import java.util.Scanner;
public class Array_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [][]a=new int[2][];
		 a[0]=new int [3];
		 a[1]=new int [5];
		 for(int i=0;i<=a.length-1;i++) {
			 for( int j=0;j<=a[i].length-1;j++) {
				 System.out.println("Enter the ages of students from the classroom" + i + "Students + j");
				 a[i][j]=scan.nextInt();
			 }
		 }
		

	}

}
