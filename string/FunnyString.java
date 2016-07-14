package misc;

public class FunnyString {

	public static void main(String[] args) {

		String str = "abdgtwyz";
		
		int i = 1;
		int j = str.length()-2;
		boolean isFunny = true;
		
		while(i<str.length()-1){
			
			if(str.charAt(i)-str.charAt(i-1) + str.charAt(j)-str.charAt(j+1) != 0){
				isFunny = false;
				break;
			}
			i++;
			j--;
		}
		
		System.out.println(isFunny);
	}

}
