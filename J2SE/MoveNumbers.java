/* *Move all negative numbers to beginning and positive to end with constant extra space ** An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

Input Format

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6

Constraints

All numbers are intergers

Output Format

Output: -12 -13 -5 -7 -3 -6 5 6 11

Sample Input 0

-12, 11, -13, -5, 6, -7, 5, -3, -6
Sample Output 0

-12 -13 -5 -7 -3 -6 11 6 5
*/

import java.io.*;
import java.util.*;

public class MoveNumbers {
    static void segregate(int arr[] ,int n, int count){
        //count negative numbers
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                count++;
            }
        }
        //run the loop
        int i=0,j=i+1;
        while(i != count){
            //if number is negative update position of next positive number
            if(arr[i] < 0){
                i++;
                j=i+1;
            }
            //if number is positive , move it to index j and increment j
            else if(arr[i] > 0 && j < n){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    

    public static void main(String[] args) {
        int count=0;
        int arr[]={-12,11,-13,-5,6,-7,5,-3,-6};
        int n=arr.length;
        segregate(arr,n,count);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        
    }
}