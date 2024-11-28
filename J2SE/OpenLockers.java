public class OpenLockers {
    public static void main(String[] args) {
        int n = 100;// Total number of lockers
        System.out.println("Lockers that remain open:");
        for (int i = 1; i * i <= n; i++) {
			// Perfect squares remain open
            System.out.print((i * i) + " ");
        }
    }
}
