public class DeletElementInArray {

	public static void main(String[] args) {
		int[] a={10,40,30,80,60,20};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int del=40;
		System.out.println("\nElement to delete : "+del);
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(del==a[i]) {
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				count=count+1;
				break;
			}
		}
		if(count==0) {
			System.out.println("Element not found");
		}else {
			System.out.println("\nElement is successfully deleted");
			for(int i=0;i<a.length-1;i++) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
