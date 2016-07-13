package graph;

public class MyQueue {
	private int[] arr;
	private int front;
	private int rear;
	private int max;
	private int count;
	
	MyQueue(int max){
		this.max = max;
		arr = new int[max];
		front = -1;
		rear = -1;
		count = 0;
	}
	
	public boolean insert(int v){
		if(count==max)
			return false;
		if(rear==-1){
			front = 0;
			rear = 0;
		} 
		else if(rear==max-1)
			rear=0;
		else
			rear++;
			
		arr[rear]=v;
		count++;
		return true;
	}
	
	public int remove(){
		if(count==0)
			return -1;
		
		int v = arr[front];
		if(front==max-1)
			front = 0;
		
		front++;
		count--;
		return v;
	}
	
	public boolean isEmpty(){
		return count==0?true:false;
	}
}










