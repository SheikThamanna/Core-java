/**
 * write a java program to create 2D array of 8*8 size and initialize the array elements starting 
 * from 1 to 64
 * @author Sheik Thamanna
 *
 */
public class Arraycode {

	public static void main(String[] args) {
       int arr[][]=new int [8][8];
        int count=1;
        
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr[i].length;j++) {
    		   System.out.print(count+ " \t");
    		  ++ count;
    	   }
    	   System.out.println();
       }
       
	}

}
