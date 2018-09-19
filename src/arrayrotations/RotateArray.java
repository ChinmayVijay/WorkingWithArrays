package arrayrotations;

/**
 * Problem Statement: Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * 
 * @author ichin
 *
 */
public class RotateArray {
	
	public static void leftRotateArray(int[] arr, int rotateBy, int n) {
		 for(int i=0;i<rotateBy;i++)
			 leftRotateByOne(arr, n);
		 
	}
	
	public static void leftRotateByOne(int[] arr, int n) {
		int i, temp;
		temp = arr[0];
		for(i=0;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[i]= temp;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3,9,6,7,11};
		System.out.println("Original Array: ");
		printArray(arr);
		System.out.println("\nRotating Array: ");
		leftRotateArray(arr, 2, arr.length);
		printArray(arr);
	}

}
