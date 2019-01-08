package miscPackage;

public class reverseAString {

	public static void main(String[] args) {
		
		String str = "Ab,c,de!$";
		char charArray[] = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			if(!isAlphabet(charArray[i])) {
				i++;
			}
			else if(!isAlphabet(charArray[j])) {
				j--;
			}
			else {
				char temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(new String(charArray));
	}
	
	public static boolean isAlphabet(char a) {
		if((a >= 65 && a<=90 ) || (a >= 97 && a<=122 ))
			return true;
		else 
			return false;
	}

}

