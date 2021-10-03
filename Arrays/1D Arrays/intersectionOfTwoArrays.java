/*
Given two arrays arr1 and arr2. We need to find the intersection of both the arrays and return the result as a list.
*/

import java.util.*;

public class intersectionOfTwoArrays{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n1; i++){
            arr2[i] = sc.nextInt();
        }
        intersection(arr1, arr2, n1, n2);
        sc.close();
    }
    
    public static void intersection(int[] a,int[] b, int n, int m){
        HashMap<Integer,Integer> map = new HashMap<>();     // created a hashmap which will store distinct elements with their frequencies
        for(int i = 0; i < n; i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);      // updating frequencies of each element
        }
        int[] arr = new int[100001];        // created an array which will store the elements which are present in both the arrays
        Arrays.fill(arr,0);              
        for(int i = 0; i < m; i++){
            if(map.containsKey(b[i])){   // updating array which contains elements that are present in both the arrays
                arr[b[i]] = 1;
            }
        }
        ArrayList<Integer> al = new ArrayList<>();     // creating a list 
        for(int i = 0; i < m; i++){
            if(arr[b[i]]==1){                // checking if the element is present in both the arrays or not
                al.add(b[i]);                // adding the elements to the list
            }
        }
        System.out.println(al);
    }

}