class CheckNine {
	
	public static void main(String[] args){
		int count=1;

		for(int i=0;i<=100;i++){
			if (i == 9){
				count++;
			}
			else{
			String str = String.valueOf(i);
		for(int j=0;j<str.length();j++){
			
			if(str.charAt(j)== '9'){
			count++;
			break;
			}
		}
	 
		}
		}
		System.out.println(count+" ");
	
	}
}