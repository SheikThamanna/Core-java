
public class Array_01 {

	public static void main(String[] args) {
		/*
		 * String a[]=new String[4]; System.out.println(a[0]); System.out.println(a[1]);
		 * System.out.println(a[2]); System.out.println(a[3]); a[0]="jhon"; a[1]="ram";
		 * a[2]="sham"; a[3]="monisha"; System.out.println(a[0]);
		 * System.out.println(a[1]); System.out.println(a[2]); System.out.println(a[3]);
		 * // a[4]=78;
		 */	
		int a[]=new int[4];
		a[0]=85;
		a[1]=70;
		a[2]=90;
		a[3]=95;
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum+=a[i];
		}
		int avg=sum/a.length;
		System.out.println("The avg sum" +  a.length  + "Student"+ avg);
		
	}


}
