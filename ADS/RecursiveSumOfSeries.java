/*Recursive program to find the Sum of the series 1 – 1/2 + 1/3 – 1/4 … 1/N Given a positive integer N, the task is to find the sum of the series 1 – (1/2) + (1/3) – (1/4) +…. (1/N) using recursion.

Input Format

Input: N = 3

Constraints

Nis a natural number.

Output Format

Output: 0.8333333 Explanation: 1 – (1/2) + (1/3) = 0.8333333

Sample Input 0

3 
Sample Output 0

0.8333333730697632

*/

import java.io.*;
import java.util.*;

public class RecursiveSumOfSeries {
    public static float seriesSum(int i,int n,float s){
        if(i>n)
            return s;
        else{
            if(i%2 == 0)
                s-=(float)1/i;
            else
                s+=(float)1/i;
            return seriesSum(i+1,n,s);
        }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum = seriesSum(1,n,0);
        System.out.println(sum);
    }
}