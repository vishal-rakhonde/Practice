import java.util.ArrayList;

public class CommonElementOnArray3 {

	public static void main(String[] args) {
		int[] a1= {2,4,8};
		int[] a2= {2,3,4,8,10,16};
		int[] a3= {2,8,14,40};
		int x=0,y=0,z=0;
		ArrayList<Integer> al=new ArrayList<>();
		while((x<a1.length)&&(y<a2.length)&&(z<a3.length)) {
			if((a1[x]==a2[y])&&(a2[y]==a3[z])) {
				al.add(a1[x]);
				x++;
				y++;
				z++;
			}else if(a1[x]<a2[y]) {
				x++;
			}else if(a2[y]<a3[z]) {
				y++;
			}else {
				z++;
			}
			
		}for(int no:al) {
				System.out.println(no);
			}
	}

}
