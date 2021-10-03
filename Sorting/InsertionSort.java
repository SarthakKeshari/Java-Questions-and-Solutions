/* Insertion Sorting

Algorithm:
Iterate from index i --> 1 to length -1
    Assign key = A[i];
    j = i - 1;
    Loop j >= 0 and A[j] > key
        A[j + 1] = A[j];
        j = j - 1;
    End Loop
    A[j + 1] = key;
End Iterate.*/
public class InsertionSort {

 public static void main(String[] args) {

  // input array
  int[] inputArray = { 6, 5, 3, 1, 8, 7, 2, 4 };
  int length = inputArray.length;
  int j = 0;

  System.out.print("Before Sorting: ");
  printArray(inputArray);
  System.out.print("\nValues for each Iteration");
   //loop to show different iterations/steps
  for (int i = 1; i < length; i++) {
   j = i - 1;
   int key = inputArray[i];//taking the input 
   while (j >= 0 && inputArray[j] > key) {
    inputArray[j + 1] = inputArray[j];//comparing the neighbour elements 
    j = j - 1;
   }
   inputArray[j + 1] = key;
   System.out.println();
   printArray(inputArray);
  }

  System.out.print("\nAfter sorting: ");//printing the sorted array
  printArray(inputArray);

 }

 private static void printArray(int[] inputArray) {
  for (int value : inputArray) {
   System.out.print(value + " ");
  }
 }

}