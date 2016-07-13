package bitmanipulation;
/*
*Given an integer array in which every element occurs even number of time except one number which occurs odd number of time. Find the number which occurs odd number of time.
*/
public class EvenOddOccurance {

	public static void main(String[] args) {
		
		int[] arr = {1,4,6,8,1,4,5,5,6,8,7};
		
		int res = 0;
		for(int i=0; i<arr.length; i++){
			res = res^arr[i];
		}
		System.out.println(res);

	}

}
