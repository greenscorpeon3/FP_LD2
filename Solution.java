
public class Solution {
	
	static boolean palindrome(String s) {
		 int i = 0;
		 if (s.charAt(i) != s.charAt(s.length() - 1)) {
			 return false;
		 }
		 else {
			 return palindrome (s, i + 1);
		 }
	 }
	
	static boolean palindrome(String s, int i) {
		 if (i > s.length() - 1) {
			 return true;
		 }
		 else if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
			 return false;
		 }
		 else {
			 return palindrome (s, i + 1);
		 }
	 }

	public static void main(String[] args) {
		String t1 = "abcba";
		String t2 = "argentinamanitnegra";
		String t3 = "sapalsarītadēdatīraslapas";
		
		String t4 = "abccb";
		String t5 = "stirna";
		
		System.out.println(t1 + " " + palindrome(t1));
		System.out.println(t2 + " " + palindrome(t2));
		System.out.println(t3 + " " + palindrome(t3));
		
		System.out.println(t4 + " " + palindrome(t4));
		System.out.println(t5 + " " + palindrome(t5));

	}

}
