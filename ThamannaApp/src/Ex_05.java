
public class Ex_05 {

	public static void main(String[] args) {
		int SearchForNum=17;
		int count=0;
		outer:
for(int i=1;i<=100;i++) {
inner:
	for(int j=1;j<=10;j++) {
		int num =i*j;
		
	//	System.out.print(num  + "\t");
	//	if(  num==StopAt) {
		if(num==SearchForNum) {
			count++;
		continue outer;
	}
}
	}
		System.out.println( SearchForNum + "appears" + count +" times");
}
}
