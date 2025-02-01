import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class CountCharacterusingHashMap {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str= sc.nextLine();
		if(str == null || str.length()==0){
			System.out.println("String is empty");
		} else {
			countCharacter(str);
		}
		sc.close();
	}
	public static void countCharacter(String str){
		
		HashMap<Character, Integer> map = new HashMap <Character, Integer>();
		for(char ch : str.toCharArray()){
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		map.forEach((key, value) -> System.out.println("character "+key+" - "+value+" times."));
	}
}	