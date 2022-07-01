import java.util.HashMap;
import java.util.Collection;
import java.util.Set;
public class MapExample2 {
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
			/*
			 * Collection<String> values=MyDetails.values(); for(String value:values) {
			 * System.out.println(value); }
			 */
	     Set<String> keys=MyDetails.keySet();
	     for(String key:keys) {
	    	 System.out.println(key + " : "+ MyDetails.get(key));
	     }
	     
}
}
