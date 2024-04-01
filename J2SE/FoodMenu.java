
import java.util.*;

public class FoodMenu {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean run = true;
			int a, b, c, d, e;
			a = b = c = d = e = 0;
			do {
				System.out.println("*****WELCOME*****" + '\n' + '\n' + "1 Dosa" + '\n' + "2 Samosa" + '\n' + "3 Idli"
						+ '\n' + "4 Maggi" + '\n' + "5 Tea" + '\n' + "10 Generate Bill");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the quantity");
					a = a + sc.nextInt();
					break;

				case 2:
					System.out.println("Enter the quantity");
					b = b + sc.nextInt();
					break;

				case 3:
					System.out.println("Enter the quantity");
					c = c + sc.nextInt();
					break;

				case 4:
					System.out.println("Enter the quantity");
					d = d + sc.nextInt();
					break;

				case 5:
					System.out.println("Enter the quantity");
					e = e + sc.nextInt();
					break;

				case 10:
					run = false;
					System.out.println("*****BILL*****" + '\n');
					if (a != 0)
						System.out.println("Dosa" + " " + a + " " + 50);
					if (b != 0)
						System.out.println("Samosa" + " " + b + " " + 20);
					if (c != 0)
						System.out.println("Idli" + " " + c + " " + 25);
					if (d != 0)
						System.out.println("Maggi" + " " + d + " " + 25);
					if (e != 0)
						System.out.println("Tea" + " " + e + " " + 10);
					System.out.println("Total" + " " + (a * 50 + b * 20 + c * 25 + d * 25 + e * 10));
				}

			} while (run);
		}
	}
}