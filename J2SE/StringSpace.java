// import java.util.Scanner;
class StringSpace{
	public static void stringSpace(String str,int[] arr){
	  for(int i=0;i<str.length();i++){
	      for(int j=0;j<arr.length;j++){
	          if(i==arr[j]){
	      System.out.print(" ");
	      }
	     
    	} System.out.print(str.charAt(i));
	}
}
	public static void main(String[] args){
	//	Scanner sc=new Scanner(System.in);
	//	String str=sc.nextLine();
		String str="Vishalcdacmumbai";
		int[] arr={6,10};
		stringSpace(str,arr);	
	}
}