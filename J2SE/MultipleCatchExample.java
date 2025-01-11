public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Simulate different exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            
            int result = 10 / 0; // ArithmeticException
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Some other exception occurred - " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
