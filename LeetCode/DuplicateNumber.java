//leetcode question - https://leetcode.com/problems/find-the-duplicate-number/

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2}; //leetcode sample case1
        int ans =findDuplicate(arr);
        System.out.println(ans);

    }

    static int findDuplicate(int[] nums) { //cyclic sort
        int i =0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        return nums[nums.length -1];

    }

    static void swap(int[] arr,int first,int second){   //function to swap 2 numbers in array
        int temp =  arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
