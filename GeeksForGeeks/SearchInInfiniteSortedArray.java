//Question : You have to search for an element in an infinitely sorted array and return the position of the given element;

public class InfiniteArray {
    public static void main(String[] args) {
int  arr[]={1,3,4,5,6,8,12,31,34,45,67,123,231,454,676};
        System.out.println(ans(arr,123));
    }
   //you have to search in chunks in order to find the element , in order to do that you have to find the range in which your target element is there;
    static int ans(int nums[],int target){

        int start=0;
        int end=1;
        while(nums[end]<target){
            int temp=end+1;
            end=end+(end-start+1)*2;
start=temp;

        }

return infiniteArray(nums,target,start,end);
    }
    static int infiniteArray(int nums[],int target,int start ,int end){


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else return mid;
        }

        return -1;
    }
}
