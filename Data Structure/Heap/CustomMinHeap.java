import java.util.ArrayList;
//Implemented  a custom MinHeap using generics which supports operation to peek ,insert and  remove
public class CustomMinHeap <T extends Comparable<T>> {

    ArrayList<T> list;
    //constructor
    public CustomMinHeap(){
        list = new ArrayList<>();
    }
    //function to insert into min heap
    public void insert(T val){
        list.add(val);
        upHeapify(list.size()-1);
    }
    //function to get the index of the parent
    public int getParentIndex(int index){
        return (index -1)/2;
    }
    //function to get the index of the left child
    public int getLeftChildIndex(int index){
        return 2*index + 1;
    }
     //function to return no of elements in the heap
    public int size(){
        return list.size();
    }
     //function to upheapify
    public void upHeapify(int index){
        if(index==0){
            return;
        }
        //getting parent index
        int parentindex = getParentIndex(index);
        //if the parent value is greater than current node value swap them since parent has to be minimum
        if(list.get(parentindex).compareTo(list.get(index)) > 0){
            T temp = list.get(parentindex);
            list.set(parentindex,list.get(index));
            list.set(index,temp);
            upHeapify(parentindex);
        }

    }
 
     //function to remove the element from the heap
    public T  remove(){
        if(list.size()==0){return null;}
        if(list.size()==1){return  list.remove(0);}
        T val = list.get(0);
        T temp = val;
        //swap root elment with the last element
        list.set(0,list.get(list.size()-1));
        list.set(list.size()-1,temp);
        //remove the last element
        list.remove(list.size()-1);
        downHeapify(0);
        return val;
    }
     //function to downheapify
    public void downHeapify(int index){
        int minimum = index;
        //getting left child index
        int left =getLeftChildIndex(index) ;
        //getting right child index
        int right =getRightChildIndex(index);
         //if left child value is smaller than current minimum  index value set minimum to left child  index
        if(left < list.size() && list.get(left).compareTo(list.get(minimum) ) < 0){
            minimum = left ;
        }
        //if right child value is smaller than current minimum  index value set minimum to right child  index
        if(right< list.size() && list.get(right).compareTo(list.get(minimum) ) < 0){
            minimum = right;
        }
         //swap minimum index value to current index value if minimum !=index
        if(minimum !=index){
            T temp = list.get(minimum);
            list.set(minimum,list.get(index));
            list.set(index,temp);
            downHeapify(minimum);
        }
    }
    //function to get the index of the right child
    public int getRightChildIndex(int index){
        return 2*index + 2;
    }
     //function to peek into min heap and get the root
    public T peek() throws Exception {
        if(list.size()==0){
            throw new Exception("Heap is empty.Cannot peek");
        }
        return list.get(0);
    }
    @Override
    public String toString() {
        return list.toString();
    }
    public static void main(String[] args) throws Exception {
        //Initialize the heap
        CustomMinHeap<Integer> minHeap = new CustomMinHeap<>();
         //inserting into the heap
        minHeap.insert(5);
        minHeap.insert(500);
        minHeap.insert(10);
        minHeap.insert(100);
        minHeap.insert(15);
        minHeap.insert(20);
         //display the heap
        System.out.println(minHeap);
         //get the element at the top
        System.out.println(minHeap.peek());
         //remove the min element and print it
        System.out.println(minHeap.remove());
        //display the heap after removing min element
        System.out.println(minHeap);
         //display the size of the heap
        System.out.println(minHeap.size());

    }
}
