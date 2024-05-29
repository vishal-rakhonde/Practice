
//The Java code for printing a number pattern program is given below:


public class NumberPattern2 {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++) {
			System.out.print(j+" ");
			}

            System.out.println();
        }

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}

            System.out.println();
        }
    }
}
