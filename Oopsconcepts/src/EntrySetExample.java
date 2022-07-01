import java.util.HashMap;
import java.util.Map.Entry;//Method used for entry of the set
import java.util.Set;


public class EntrySetExample {
public static void main(String[] args) {
		
		HashMap<String,String> MyDetails=new HashMap<String,String>();
	     System.out.println(MyDetails);
	     MyDetails.put("FirstName","Alex");
	     MyDetails.put("LastName","john");
	     
	     MyDetails.put("SureName","john");
	     MyDetails.put("PhoneNumber","9008814696");
	     MyDetails.put("PassWord","##99&&");
	     MyDetails.put("DOB","20/04/1976");
	     MyDetails.put("Gender","Female");
	     Set<Entry<String,String>> entrys=MyDetails.entrySet();
	     for(Entry entry:entrys) {
	    	 System.out.println(entry);//print both the values and keys
	    	 
	     }
	     for(Entry entry:entrys) {
	    	 System.out.println(entry.getKey());//It gives only key present in the entry
	    	 System.out.println(entry.getValue());//It gives only values present in the entry
	    	 
	    	 
	     }
	    

}
}
