//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

//Bonus: Can you do this in one pass??


package miscPackage;

import java.util.HashSet;

public class CodingProblemDay1 {

	public static void main(String[] args) {
		
		int a[] = {10,15,3,7};
		int target = 17;
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			if(hs.contains(target - a[i])) {
				System.out.println(a[i] + " : " + (target - a[i]));
				return;
			} else {
				hs.add(a[i]);
			}
		}
		System.out.println("No such number");
	}

}
