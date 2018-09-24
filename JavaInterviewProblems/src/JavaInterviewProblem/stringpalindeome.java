package JavaInterviewProblem;

public class stringpalindeome {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String TestName = "1bo b1";
		System.out.println(isPalindrome3(TestName));
	} 

	// 1 String Buffer
	private static boolean isPalindrome1(String testName) {
		StringBuilder sb = new StringBuilder(testName);
		return (testName.equals(sb.reverse().toString()));
	}

	// 2 char at
	private static boolean isPalindrome2(String testName) {
		String reverseTestName = "";
		for (int i = testName.length() - 1; i >= 0; i--) {
			reverseTestName = reverseTestName + testName.charAt(i);
		}

		return testName.equals(reverseTestName);
	}

	// 3  recursive way
	private static boolean isPalindrome3(String testName) {
		String clean = testName.replaceAll("\\s","").toLowerCase(); 

		return recursivePalindrome(clean, 0, clean.length()-1);
	}

	private static boolean recursivePalindrome(String clean, int forward, int backward) {
		if(forward==backward)
		return true;
		
		if(clean.charAt(forward)!= clean.charAt(backward)){
			return false; 
		}
		
		if(forward<backward+1){
			return recursivePalindrome(clean, forward+1, backward-1); 
		}
		return false;
	}
	
	

}
