import java.util.ArrayList;
public class BoxingExample {
	public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(new Integer(120));
        al.add(60);
        al.add(160);
        al.add( new Double(40.5));
        al.add(180);
        al.add(new Boolean(false));
        al.add("java");
        System.out.println(al);
       Integer a= (Integer) al.get(2);
        System.out.println(a);
        
        
        
}
}
