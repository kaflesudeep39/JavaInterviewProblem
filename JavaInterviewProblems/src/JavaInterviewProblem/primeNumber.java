package JavaInterviewProblem;

public class primeNumber {

	public static void main(String[] args) {
		// 3, 5, 7, 11, 13, 17
		int numberofPrime = 4;

		System.out.println(isPrimeNumber(numberofPrime));
	}

	public static boolean isPrimeNumber(int numberofPrime) {
		int sqr = (int) Math.sqrt(numberofPrime);
		boolean isp = true;
		for (int i = 2; i <= sqr; i++) {
			if (numberofPrime % i == 0) {
				isp = false;
				break;
			}
		}
		return isp;
	}

}
