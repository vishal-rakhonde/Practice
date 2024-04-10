/*Write a Program that demonstrates widening conversion from int to (double,float, boolean, string) and
prints the result.*/

public class WideningConversion {
    public static void main(String[] args) {
        int i = 10;

        double a = i;
        System.out.println("Widening conversion to double: " + a);

        float f = i;
        System.out.println("Widening conversion to float: " + f);

        boolean b = (i != 0);
        System.out.println("Widening conversion to boolean: " + b);

        String s = String.valueOf(i);
        System.out.println("Widening conversion to String: " + s);
    }
}
