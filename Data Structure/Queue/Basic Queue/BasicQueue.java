/*Queue is an abstract data structure, somewhat similar to Stacks. 
Unlike stacks, a queue is open at both its ends. One end is always
used to insert data (enqueue) and the other is used to remove data
(dequeue). Queue follows First-In-First-Out methodology, i.e., the
data item stored first will be accessed first.*/

// this is the implementation of a basic queue 

import java.util.Arrays;
import java.util.Scanner;
class QueUe{
    
    int[] Qarray;
    int size;
    int front,rear;
    
    QueUe(int capacity){
        size=capacity;
        Qarray = new int[capacity];//creating a queue as a array
        rear=-1;// initializing rear
        front=-1;//initializing front
	   //queue is empty at first 
     }
    
    void display(){
        System.out.println(Arrays.toString(Qarray)); //print the queue
    }
    
    void value(){
        System.out.println("front:"+front+"\t rare:"+rear); //to see the current rear & front
    }
    
    void peek()
	{
		if (isEmpty()) 
		{
			System.out.println("Queue empty!");//if queue empty-> no element to peek
			return;
		}
		 System.out.println("peek value is "+Qarray[front]);//peeking the front value
	}
	
    void enqueue(int val){
        if (isFull())
		{
			System.out.println("queue is full!");
			return; //can not enter element if queue is full
		}
        if(rear==-1){
            front++; //for 1st element put in queue from queue were empty 
        }
		System.out.println("Adding " + val);

		rear++ ; //adding new element in rear -> rear++
		Qarray[rear] = val; //putting the value
    }
    
    void dequeue()
	{
		// check for queue underflow
		if (isEmpty())
		{
			System.out.println("queue is empty");
			return; // if queue is empty -> no element to delete 
		}

		System.out.println("Deleting " + Qarray[front]);
        if(front==rear){
            front=-1;
            rear=-1;//when only 1 element was in queue , now deleted
            return; //now queue is empty 
        }
		front++; //deleting element-> front ++
	}
	
	Boolean isFull()
	{
		return (rear==size-1); // check if queue is full
	}
	
	Boolean isEmpty()
	{
		return (front==-1); // check if queue is empty 
	}
}
class BasicQueue { 

    public static void main(String[] args) 
    { 
        QueUe que = new QueUe(4);

	   //just some random queue function sequence 
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
