
/**
 * 
 * @author ananda Thakur
 *
 */
public class ReverseEscapingSpclChar {
	
	public static void main (String args[]) {
		
		String strToBeReversed = "ab$e%nFg*" ;
    	System.out.println("strToBeReversed\t" + strToBeReversed);
//		String reversedString = reverseTheString(strToBeReversed);
		System.out.println("reversedString\t" + reverseTheString(strToBeReversed));
		
	}

	private static String reverseTheString(String strToBeReversed) {
		
		char[] beforRverse = strToBeReversed.toCharArray();
		int startIndex = 0;
		int lastIndex = strToBeReversed.length()-1;
		
		/*for (char c : beforRverse) {
			System.out.println(" Char " + c +"\t" + isSpecialChar(c));
		}*/
		
		while (startIndex < lastIndex) {
			
			if (isSpecialChar(beforRverse[startIndex])) {
				startIndex++;
			} else if (isSpecialChar(beforRverse[lastIndex])) {
				lastIndex--;
			} else  {
    			/*System.out.println("Start Index && Last index\t" + startIndex +"\t"+ lastIndex);
    			System.out.println("Start Index char && Last index char\t" + beforRverse[startIndex] +"\t"+ beforRverse[lastIndex]);*/
				char temp = beforRverse[lastIndex];
				beforRverse[lastIndex] = beforRverse[startIndex];
				beforRverse[startIndex] = temp;
				startIndex++;
				lastIndex--;
			}
		}

		return new String(beforRverse);
	}

	private static boolean isSpecialChar(char c) {
		char[] specialChar = {'@','#','$','^','*','(',')','%'};
		return new String(specialChar).contains(String.valueOf(c));
	}

}
