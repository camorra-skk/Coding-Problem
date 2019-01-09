//Given an array of integers, find the first missing positive integer in linear time and constant space.
//In other words, find the lowest positive integer that does not exist in the array.
//The array can contain duplicates and negative numbers as well.

//For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

//You can modify the input array in-place.



package miscPackage;

import java.util.HashSet;

public class CodingProblemDay4 {

	public static void main(String[] args) {
		
		int a[] = {1,2,0};
		int k = Integer.MAX_VALUE;
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(a[i] > 0) {
				hs.add(a[i]);
				if(k > a[i]) {
					if(!hs.contains(a[i]+1))
					 k = a[i]+1;
				}
			}
		}
		System.out.println(k);
	}

}
