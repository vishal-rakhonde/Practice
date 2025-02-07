import java.util.Map;
import java.util.HashMap;
import java.util.Set;
class FindDuplicates {
	public static void main(String[] args){
		int[] arr={10,55,77,40,60,46,80,10,77};
		Map <Integer,Integer> hm= new HashMap<>();
		for(int no : arr){
			Integer count = hm.get(no);
			if(count == null){
				hm.put(no,1);
			}
			else {
				count=count+1;
				hm.put(no,count);
			}
		}
		System.out.print("Duplicate elements are : ");
		Set<Map.Entry<Integer,Integer>> es= hm.entrySet();
		for(Map.Entry<Integer,Integer> me : es){
			if(me.getValue() > 1){
				System.out.print(me.getKey()+" ");
			}
		}
	}
}