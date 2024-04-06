/*Write a Java Program to check whether the Given Number is Prime Number or NOT. */
import java.util.Scanner;

import java.util.Scanner;

class PrimeNumberRecursive {
    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime or not:");
        int number = sc.nextInt();

        if (isPrime(number, 2))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

        sc.close();
    }
}



		