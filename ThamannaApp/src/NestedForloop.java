
public class NestedForloop {

	public static void main(String[] args) {
//for(int i=1;i<=3;i++) {
//	for(int j=1;j<=2;j++) {
//		System.out.println(i +" " + j);
//	}
//}
		
		int i=1;
		while(i<=7) {
			int j=1;
			while(j<=i) {
				
				
				System.out.print(i);
				j++;
				
			}
			i++;
			System.out.println("");
		}
	}

}
