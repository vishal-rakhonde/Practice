import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		do {
			System.out.println("Enter the operation to perform:" + "\n" + "1 Add" + "\n" + "2 Subtract" + "\n"
					+ "3 Multiply" + "\n" + "4 Divide" + "\n" + "5 Exit");
			System.out.println("");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter two no:");
				System.out.println(sc.nextInt() + sc.nextInt() + "\n");
				break;
			case 2:
				System.out.println("Enter two no:");
				System.out.println(sc.nextInt() - sc.nextInt() + "\n");
				break;
			case 3:
				System.out.println("Enter two no:");
				System.out.println(sc.nextInt() * sc.nextInt() + "\n");
				break;
			case 4:
				System.out.println("Enter two no:");
				System.out.println(sc.nextInt() / sc.nextInt() + "\n");
				break;
			case 5:
				System.out.println("bye");
				run = false;
			}
		} while (run);
		sc.close();
	}
}