// Java program for implementation of Insertion Sort
class InsertionSort {
	 //Function to sort array using insertion sort
	void sort(int arr[])
	{
		int n = arr.length;//checking the length of array
		for (int i = 1; i < n; ++i) {
			int m = arr[i];
			int j = i - 1;
               // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
			while (j >= 0 && arr[j] > m) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = m;
		}
	}
// function to print the array
static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

// main method where we take input and call the function from above
	public static void main(String args[])
	{
		int arr[] = { 34, 1, 130, 15, 6 };

		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		printArray(arr);
	}
}
