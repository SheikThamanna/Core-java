
public class Greeting {
	public static void main(String...args) {
		byte hour=16;
		// if hour is less than 12 print good morning
		if(hour<12)
			System.out.println("Good Morning");
		//if hour is greater or less than 15 print good Afternoon
		else if(hour>=12 && hour<15)
		System.out.println("Good Afternoon");
		//if hour is greater than 15 print good evening
		else
			System.out.println("Good evening");
	}

}
