//Write a Java program to find a missing number in an integer array?
import java.util.Scanner;

class MissingNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; 
		int originalSum = 0;
        System.out.println("Enter the length of array:");
        int size = sc.nextInt();
        int arr[] = new int[size ];
        System.out.println("Enter " + (size ) + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
       int first=arr[0];
	   int last = arr[size -1 ];
	   
	   for(int a = first ; a<= last ; a++){
	   originalSum +=a;
	   }
        int missingNum = originalSum - sum;
        System.out.println("Missing number is : " + missingNum);
    }
}

