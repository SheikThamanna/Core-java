
public class Pattern {

	public static void main(String[] args) {
for(int i=1;i<=8;i++) {
	
	for(int j=1;j<=8;j++) {
		
		if(i%2!=0 && j%2!=0 ) {
			System.out.print("W" + " ");
		}else if(i%2==0 && j%2==0)
		{
			System.out.print("W" + " ");
		}
		else
		{
			System.out.print("B" + " ");
		}
	}
	System.out.println(" ");
}
	}

}
