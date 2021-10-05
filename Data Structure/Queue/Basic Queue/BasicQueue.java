import java.util.Arrays;
import java.util.Scanner;
class QueUe{
    
    int[] Qarray;
    int size;
    int front,rear;
    
    QueUe(int capacity){
        size=capacity;
        Qarray = new int[capacity];
        rear=-1;
        front=-1;
    }
    
    void display(){
        System.out.println(Arrays.toString(Qarray));
    }
    
    void value(){
        System.out.println("front:"+front+"\t rare:"+rear);
    }
    
    void peek()
	{
		if (isEmpty()) 
		{
			System.out.println("Queue empty!");
			return;
		}
		 System.out.println("peek value is "+Qarray[front]);
	}
	
    void enqueue(int val){
        if (isFull())
		{
			System.out.println("queue is full!");
			return;
		}
        if(rear==-1){
            front++;
        }
		System.out.println("Adding " + val);

		rear++ ;
		Qarray[rear] = val;
    }
    
    void dequeue()
	{
		// check for queue underflow
		if (isEmpty())
		{
			System.out.println("queue is empty");
			return;
		}

		System.out.println("Deleting " + Qarray[front]);
        if(front==rear){
            front=-1;
            rear=-1;//last element
            return;
        }
		front++;
	}
	
	Boolean isFull()
	{
		return (rear==size-1);
	}
	
	Boolean isEmpty()
	{
		return (front==-1);
	}
}
class BasicQueue { 

    public static void main(String[] args) 
    { 
        QueUe que = new QueUe(4);

		que.enqueue(5);
	    que.peek();
		que.dequeue();
		que.peek();
		que.enqueue(20);
		que.peek();
		que.enqueue(4);
		que.value();
		que.enqueue(17);
		que.enqueue(9);
		
		if (que.isFull())
			System.out.println("Queue Is full");
			
		que.peek();
		que.dequeue();
		que.dequeue();
		que.peek();

		System.out.println("Queue size is " + que.size);

		que.dequeue();
		que.dequeue();
		
		if (que.isEmpty())
			System.out.println("Queue Is Empty");

    } 
} 
