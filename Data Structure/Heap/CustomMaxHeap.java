import java.util.ArrayList;

//Implemented  a custom MaxHeap using generics which supports operation to peek ,insert and  remove

public class CustomMaxHeap <T extends Comparable<T>> {
    ArrayList<T> list;
     //constructor
    public CustomMaxHeap(){
      list = new ArrayList<>();
    }
    //function to insert into max heap
    public void insert(T val){
       list.add(val);
       upHeapify(list.size()-1);
    }
    //function to peek into max heap and get the root
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
    //function to return no of elements in the heap
    public int size(){
        return list.size();
    }
    //function to remove the element from the heap
    public T  remove(){
        if(list.size()==0){return null;}
        if(list.size()==1){return list.remove(0);}
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

        int maximum = index;
        //getting left child index
        int left =getLeftChildIndex(index);
        //getting right child index
        int right =getRightChildIndex(index);
         //if left child value is greater than current maximum  index value set maximum to left child  index
        if(left < list.size() && list.get(left).compareTo(list.get(maximum) ) > 0){
           maximum = left ;
        }
        //if right child value is greater than current maximum  index value set maximum to right child  index
        if(right< list.size() && list.get(right).compareTo(list.get(maximum) ) > 0){
            maximum = right;
        }
        //swap maximum index value to current index value if maximum !=index
        if(maximum !=index){
            T temp = list.get(maximum);
            list.set(maximum,list.get(index));
            list.set(index,temp);
            downHeapify(maximum);
        }
    }
    //function to upheapify
    public void upHeapify(int index){
        if(index==0){
            return;
        }
        //getting parent index
        int parentindex = getParentIndex(index);
        //if the parent value is smaller than current node value swap them since parent has to be maximum
        if(list.get(parentindex).compareTo(list.get(index)) < 0){
            T temp = list.get(parentindex);
            list.set(parentindex,list.get(index));
            list.set(index,temp);
            upHeapify(parentindex);
        }

    }
    //function to get the index of the parent
    public int getParentIndex(int index){
        return (index -1)/2;
    }
    //function to get the index of the left child
    public int getLeftChildIndex(int index){
        return 2*index + 1;
    }
    //function to get the index of the right child
    public int getRightChildIndex(int index){
        return 2*index + 2;
    }
    public static void main(String[] args) throws Exception {
     //Initialize the heap
     CustomMaxHeap<Integer> maxHeap = new CustomMaxHeap<>();
     //inserting into the heap
     maxHeap.insert(5);
     maxHeap.insert(500);
     maxHeap.insert(10);
     maxHeap.insert(100);
     maxHeap.insert(15);
     maxHeap.insert(20);
     //display the heap
     System.out.println(maxHeap);
     //get the element at the top
     System.out.println(maxHeap.peek());
     //remove the max element and print it
     System.out.println(maxHeap.remove());
     //display the heap after removing max element
     System.out.println(maxHeap);
     //display the size of the heap
     System.out.println(maxHeap.size());
    }
}
