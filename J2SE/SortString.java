import java.util.Scanner;
class SortString{
	public static void sortWithoutMethod(String str){
		char[] arr=str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}	
			}
		}
		System.out.println(new String(arr));
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		char arr;
		sortWithoutMethod(str);
		sc.close();
		
	}
}
		