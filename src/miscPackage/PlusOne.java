//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//The digits are stored such that the most significant digit is at the head of the list, 
//and each element in the array contain a single digit.
//You may assume the integer does not contain any leading zero, except the number 0 itself.

package miscPackage;

public class PlusOne {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,9};
		int num = 0;
		
		for(int i=a.length-1;i>=0;i--) {
			num = num + (int)Math.pow(10, a.length -i-1)*a[i];
		}
		
		num = num + 1;
		System.out.println(num);
		int length = String.valueOf(num).length();
		int b[] = new int[length];
		int i =length -1;
		while(num > 0) {
			b[i] = num %10;
			num = num /10;
			i--;
		}
		
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
	}

}
