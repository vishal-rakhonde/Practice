
import java.util.*;
import java.lang.Math;

public class Squares {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How many numbers do you want to store?");
			double d[] = new double[sc.nextInt()];
			System.out.println("Enter the numbers");
			for (int i = 0; i < d.length; i++)
				d[i] = sc.nextDouble();
			for (double d1 : d)
				System.out.print(d1 + " ");
			System.out.println();
			boolean run = true;
			do {
				System.out.println("\n" + "Choose any option:" + "\n" + "1 Double nums" + "\n" + "2 Square nums" + "\n"
						+ "3 Square root nums" + "\n" + "4 Exit" + "\n");
				switch (sc.nextInt()) {
				case 1:
					for (double d1 : d)
						System.out.print(d1 * 2 + " ");
					System.out.println();

					break;

				case 2:
					for (double d1 : d)
						System.out.print(d1 * d1 + " ");
					System.out.println();
					break;

				case 3:
					for (double d1 : d)
						System.out.print(Math.sqrt(d1) + " ");
					System.out.println();
					break;

				case 4:
					System.out.println("bye");
					run = false;

				}
			} while (run);
		}
	}
}