package JavaInterviewProblem;

public class primeNumber2 {
	public static void main(String[] args) {
		int howMany = 10;
		int i = 1;
		int j = 3;
		while (i < howMany) {
			if (primeNumber.isPrimeNumber(j)) {
				i++;
				System.out.println(j);
			}
			j++;
		}
	}
}
