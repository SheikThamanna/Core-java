/**
 * write nested for loop to itetrate through the 2D array
 * @author Sheik Thamanna
 *
 */
public class foreachchallenge {

	public static void main(String[] args) {
		char arr[][]= {
				{'*'},
				{'*','*'},
				{'*','*','*'},
				{'*','*','*','*'},
				{'*','*','*','*','*'},
				{'*','*','*','*','*','*'},
				{'*','*','*','*','*','*','*'},
		};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println(" ");
		}
		
		
		}
   
}


