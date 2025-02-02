class MinMaxValuesFromArray {
	public static void main(String[] args){
		int[] arr = {40,55,65,43,10,85,22,655};
		int min= arr[0];
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		System.out.println("Minimum : "+ min);
		System.out.println("Maximum : "+ max);
	}
}