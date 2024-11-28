public class OpenLockers {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Lockers that remain open:");
        for (int i = 1; i * i <= n; i++) {
            System.out.print((i * i) + " ");
        }
    }
}
