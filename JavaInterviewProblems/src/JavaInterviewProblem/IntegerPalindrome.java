package JavaInterviewProblem;

public class IntegerPalindrome {

	public static void main(String[] args) {

		int palindrome = 121;
		
		System.out.println(testPalindrome(palindrome));
	}

	private static boolean testPalindrome(int palindrome) {
	 int reverse = 0;
	 int a = palindrome; 
		while (a>0){
			reverse = reverse*10+ (a%10); 
			a = a/10; 
		}
		System.out.println(reverse);
		return palindrome==reverse;
	}

}
