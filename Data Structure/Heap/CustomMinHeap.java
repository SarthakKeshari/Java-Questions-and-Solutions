import java.util.ArrayList;
//Implemented  a custom MinHeap using generics which supports operation to peek ,insert and  remove
public class CustomMinHeap <T extends Comparable<T>> {

    ArrayList<T> list;
    public CustomMinHeap(){
        list = new ArrayList<>();
    }
    public void insert(T val){
        list.add(val);
        upHeapify(list.size()-1);
    }
    public int getParentIndex(int index){
        return (index -1)/2;
    }
    public int getLeftChildIndex(int index){
        return 2*index + 1;
    }
    public int size(){
        return list.size();
    }
    public void upHeapify(int index){
        if(index==0){
            return;
        }
        int parentindex = getParentIndex(index);
        if(list.get(parentindex).compareTo(list.get(index)) > 0){
            T temp = list.get(parentindex);
            list.set(parentindex,list.get(index));
            list.set(index,temp);
            upHeapify(parentindex);
        }

    }

    public T  remove(){
        if(list.size()==0){return null;}
        if(list.size()==1){return  list.remove(0);}
        T val = list.get(0);
        T temp = val;
        list.set(0,list.get(list.size()-1));
        list.set(list.size()-1,temp);
        list.remove(list.size()-1);
        downHeapify(0);
        return val;
    }
    public void downHeapify(int index){
        int minimum = index;
        int left =getLeftChildIndex(index) ;
        int right =getRightChildIndex(index);

        if(left < list.size() && list.get(left).compareTo(list.get(minimum) ) < 0){
            minimum = left ;
        }
        if(right< list.size() && list.get(right).compareTo(list.get(minimum) ) < 0){
            minimum = right;
        }
        if(minimum !=index){
            T temp = list.get(minimum);
            list.set(minimum,list.get(index));
            list.set(index,temp);
            downHeapify(minimum);
        }
    }
    public int getRightChildIndex(int index){
        return 2*index + 2;
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
    public static void main(String[] args) throws Exception {
        CustomMinHeap<Integer> minHeap = new CustomMinHeap<>();
        minHeap.insert(5);
        minHeap.insert(500);
        minHeap.insert(10);
        minHeap.insert(100);
        minHeap.insert(15);
        minHeap.insert(20);
        System.out.println(minHeap);
        System.out.println(minHeap.peek());
        System.out.println(minHeap.remove());
        System.out.println(minHeap);

    }
}
