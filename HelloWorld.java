import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Here ye : important announcement");
		
		System.out.print("Today is ");
		displayCurrentDate();

		System.out.println("Hello, World!");
		System.out.println("Hello, Alice!");
		System.out.println("Hello, Bob!");
		System.out.println("Hello, Charlie!");
		System.out.println("Hello, Denise!");

		System.out.println("Farewell friends");
	}
	
	private static void displayCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
}
