
public class Foreach {

	public static void main(String[] args) {
    String arr[]= {"A","B","C","D","E"};
    //Regular for loop to print the elements from first to last
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]+ " ");
    }
    System.out.println("------------");
    //Regular for loop to print the array elements from last to first
    for(int i=arr.length-1;i>=0;i--) {
    	System.out.println(arr[i]+ " ");
    }
    System.out.println("--------------");
    //enhanced for loop print the array elements prints from first to last
    for(String name:arr) {
    	System.out.println(name);
    }

	}

}
