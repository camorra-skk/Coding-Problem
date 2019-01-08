package miscPackage;

public class ArrayRotation {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		int d = 2;
		int n = 7;
		leftRotate(a, d, n);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
	
	public static void leftRotate(int arr[],int d, int n) {
		for(int i=0;i<d;i++) {
			leftRotateByOne(arr,n);
		}
	}
	
	public static void leftRotateByOne(int arr[],int n) {
		int temp = arr[0];
		for(int i=0 ;i <arr.length -1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length -1] = temp;
	}

}
