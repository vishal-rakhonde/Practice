
import java.util.*;

public class CheckDouble {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			double a, b;
			System.out.println("Enter first no.");
			if (sc.hasNextDouble())
				a = sc.nextDouble();
			else {
				System.out.println("Enter valid no.");
				return;
			}
			System.out.println("Enter second no.");
			if (sc.hasNextDouble())
				b = sc.nextDouble();
			else {
				System.out.println("Enter valid no.");
				return;
			}
			double avg = (a + b) / 2;
			System.out.println(avg);
		}
	}
}