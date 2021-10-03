import java.util.ArrayList;

//Implemented  a custom MaxHeap using generics which supports operation to peek ,insert and  remove

public class CustomMaxHeap <T extends Comparable<T>> {
    ArrayList<T> list;
    public CustomMaxHeap(){
      list = new ArrayList<>();
    }
    public void insert(T val){
       list.add(val);
       upHeapify(list.size()-1);
    }
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
    public int size(){
        return list.size();
    }
    public T  remove(){
        if(list.size()==0){return null;}
        if(list.size()==1){return list.remove(0);}
        T val = list.get(0);
        T temp = val;
        list.set(0,list.get(list.size()-1));
        list.set(list.size()-1,temp);
        list.remove(list.size()-1);
         downHeapify(0);
       return val;
    }
    public void downHeapify(int index){
        int maximum = index;
        int left =getLeftChildIndex(index) ;
        int right =getRightChildIndex(index);

        if(left < list.size() && list.get(left).compareTo(list.get(maximum) ) > 0){
           maximum = left ;
        }
        if(right< list.size() && list.get(right).compareTo(list.get(maximum) ) > 0){
            maximum = right;
        }
        if(maximum !=index){
            T temp = list.get(maximum);
            list.set(maximum,list.get(index));
            list.set(index,temp);
            downHeapify(maximum);
        }
    }
    public void upHeapify(int index){
        if(index==0){
            return;
        }
        int parentindex = getParentIndex(index);
        if(list.get(parentindex).compareTo(list.get(index)) < 0){
            T temp = list.get(parentindex);
            list.set(parentindex,list.get(index));
            list.set(index,temp);
            upHeapify(parentindex);
        }

    }
    public int getParentIndex(int index){
        return (index -1)/2;
    }
    public int getLeftChildIndex(int index){
        return 2*index + 1;
    }

    public int getRightChildIndex(int index){
        return 2*index + 2;
    }
    public static void main(String[] args) throws Exception {
     CustomMaxHeap<Integer> maxHeap = new CustomMaxHeap<>();
     maxHeap.insert(5);
     maxHeap.insert(500);
     maxHeap.insert(10);
     maxHeap.insert(100);
     maxHeap.insert(15);
     maxHeap.insert(20);
     System.out.println(maxHeap);
     System.out.println(maxHeap.peek());
     System.out.println(maxHeap.remove());
     System.out.println(maxHeap);
     System.out.println(maxHeap.size());
    }
}
