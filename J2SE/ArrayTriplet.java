//Write a Java program or function which finds triplets in the given array whose sum is equal to given number.

import java.util.Arrays;

public class ArrayTriplet {
    public static void main(String[] args) {
        int[] arr={4,5,7,3,6,2,0,1};
        int sum=7;
        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++){
            int l=i+1;
            int r=arr.length-1;

            while(l<r){
                if(arr[i]+arr[l]+arr[r]==sum){
                    System.out.println(i+","+l+","+r);
                    l++;
                    r--;
                }else if(arr[i]+arr[l]+arr[r]<sum) l++;
                else r--;
            }
        }
    }
}
