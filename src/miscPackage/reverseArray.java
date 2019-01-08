package miscPackage;

public class reverseArray {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		int n = a.length;
		
		for(int i=0;i<n/2;i++) {
			int temp = a[i];
			a[i] = a[n - i -1];
			a[n - i - 1] = temp;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
		}
	}
}
