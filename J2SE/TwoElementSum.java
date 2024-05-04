//Write a Java program which finds two element in the given array whose sum is equal to giv 'n number?

import java.util.Scanner;

public class TwoElementSum {

	public static void main (String [] args ){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array : ");
	int size = sc.nextInt();
	int [] arr = new int [size];
	System.out.println("Enter the array element : ");
	for(int a =0; a<size; a++){
	  arr[a] = sc.nextInt();
	 }
   System.out.println("Enter the Target : ");
	 int target = sc.nextInt();
	 int twoSum = 0;
	 int diff =0;
 
	 for(int a = 0; a<size -1 ; a++ ){
		for(int b = a+1 ; b<size; b++){
			if(target == arr[a]+arr[b]){
				System.out.println(arr[a]+ " "+arr[b]);   
			}
		}
	}
}
 
 
 
}