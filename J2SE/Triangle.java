
//The Java code for printing the triangle star pattern 


public class Triangle {
    public static void main(String[] args) {
        int n=5;

        for(int i=0; i<n;i++){
            for(int j=i;j<n;j++) System.out.print(" ");

            for(int j=0;j<=2*i;j++){
                if(j==0 || j==2*i || i==0 || i==n-1) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
