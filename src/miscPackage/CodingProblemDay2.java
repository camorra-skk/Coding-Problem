// Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

// For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
package miscPackage;

import java.util.Arrays;

public class CodingProblemDay2 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int mul = 1;
		int left[] = new int[5];
		int right[] = new int[5];
		int prod[] = new int[5];
		int temp = 1;
		left[0] = 1;
		right[4] = 1;
//		for (int i = 1; i < a.length; i++) {
//			left[i] = left[i-1]* a[i-1];
//		}
//		for (int i = a.length - 2; i >= 0; i--) {
//			right[i] = right[i+1]* a[i+1];
//		}
//		for (int i = 0; i < a.length; i++) {
//			a[i] = left[i] * right[i];
//			System.out.println(a[i]);
//		}
		Arrays.fill(prod, 1);
		for(int i=0; i<a.length;i++) {
			prod[i] = temp;
			temp *= a[i];
		}
		temp = 1;
		for(int i= a.length-1; i>=0;i--) {
			prod[i] *= temp;
			temp *= a[i];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(prod[i]);
		}
	}

}
