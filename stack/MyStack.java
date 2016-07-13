package stack;
/*
*Implement getMin() which returns minimum value from stack in O(1) time complexity.
*/
public class MyStack {
	int[] arr;
	int[] minArr;
	int max;
	int top;
	
	public MyStack(int max) {
		this.max = max;
		arr = new int[max];
		minArr = new int[max];
		top = -1;
	}
	
	public boolean push(int data){
		if(top==max-1)
			return false;
		
		
		if(top == -1){
			top++;
			arr[top]=data;
			minArr[top]= data;
		} else{
			top++;
			arr[top]=data;
			minArr[top]=(minArr[top-1]<data)?minArr[top-1]:data;
		}
		return true;
	}
	
	public int pop(){
		if(top==-1)
			return -1;
		
		int val = arr[top--];//this will delete top element from minArr also
		return val;
	}
	
	public int getMin(){
		return minArr[top];
	}
}
