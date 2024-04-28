// insertion sort
class InsertionSort{
	
	void isort(int arr[]){
		int n=arr.length;
		for(int i=1;i<n-1;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
			void display(int arr[]){
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
		}
	}

		public static void main(String[] args){
			InsertionSort is=new InsertionSort();
			int arr[]={99,89,34,11,55,33,88,44,24};
			is.display(arr);
			is.isort(arr);
			System.out.println();
			is.display(arr);
			}
		}