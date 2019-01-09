//Given an array of n elements which contains elements from 0 to n-1,
//with any of these numbers appearing any number of times.
//Find these repeating numbers in O(n) and using only constant memory space.
//For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.


package miscPackage;

import java.util.HashSet;

public class findRepeatingElementsConstantSpace {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 1, 3, 6, 6};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			boolean k = hs.add(a[i]);
			if(!k) {
				System.out.println(a[i]);
			}
		}
	}

}
