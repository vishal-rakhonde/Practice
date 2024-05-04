//Write a Java program which finds triplets in the given array whose sum is equal to giv 'n number?
import java.util.Scanner;
public class SumOfTriplet {

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

 
		 for(int a = 0; a<size -2 ; a++ ){
		 
			for(int b = a+1 ; b<size -1 ; b++){
			 
				for (int c = b+1 ; c<size; c++){
					if(target == arr[a]+arr[b] + arr[c]){
						System.out.println(arr[a]+" "+arr[b]+" "+arr[c] );
					}
				}
			}
		}
	}
 }
 
 
 
