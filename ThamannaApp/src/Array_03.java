
public class Array_03 {

	public static void main(String[] args) {
		//1D array is instantiated with data
       String [] days1 = {
    		   "Monday",
    		   "Tuesday",
    		   "Wednenesday",
    		   "Thusday",
    		   "Friday",
    		   "Saturaday",
    		   "Sunday" };
       //2D array is instantiated with data
       String [][] day2= {
    	   {"1", "Monday"},
    	   {"2", "tuesday"},
    	   {"3","wednesday"},
    	   {"4","thursday"},
    	   {"5","friday"},
    	   {"6","staurday"},
    	   {"7","Sunday"}
    	   };
       //for loop for the 1D array
	for(int i=0;i<days1.length;i++) {
		System.out.println(days1[i]);
	}
	
    System.out.println("---------------------------"); 
    
    //for loop for 2D array
    for(int i=0;i<day2.length;i++) {
       for(int j=0;j<day2[i].length;j++) {
    	   System.out.print(day2[i][j]+ " ");
       }
       System.out.println();
    }
       
	}

	}


