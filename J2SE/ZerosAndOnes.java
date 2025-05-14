class ZerosAndOnes {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 0, 0, 1, 1};
        int low = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
                low++; 
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
