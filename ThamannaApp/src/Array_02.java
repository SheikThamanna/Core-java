
public class Array_02 {

	public static void main(String[] args) {
      // int []a=new int[1000];
       
      // for(int i=1;i<=a.length-1;i++) {
    	   
    	   
    //	   System.out.println(i);
     //  }
		int t1=0, t2=1 ,nextterm;
		for(int i=0;i<=10;i++) {
			nextterm=t1+t2;
			t1=t2;
			t2=nextterm;
			System.out.print(nextterm + "  ");
			
		}
	}

}
