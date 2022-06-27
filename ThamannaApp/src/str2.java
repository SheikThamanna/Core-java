
public class str2 {

	public static void main(String[] args) {
      String s1="Java";
      String s2="java";
      System.out.println(s1.length());//->4
      System.out.println(s1.charAt(1));//->a
      
      System.out.println(s1.equals(s2));//->false
      System.out.println(s1.equals("Java"));//->true
      System.out.println("Java".equals(s2));//->false
      System.out.println("Java".equals("Java"));//->true
      System.out.println(s1.equalsIgnoreCase(s2));//true
      System.out.println(s1==s2);//false
      System.out.println(s1.toUpperCase());//JAVA
      System.out.println(s1.toLowerCase());//java
      System.out.println("\n\r\t  udayam\tKhathry\n\f" .trim());//udayam khathry
      
	}

}
